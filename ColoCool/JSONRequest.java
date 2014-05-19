package com.example.test1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

import com.example.test1.Inscription.MyRequestReceiver;



import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class JSONRequest extends IntentService {

private String inMessage;
    
    public static final String IN_MSG = "requestType";
    public static final String OUT_MSG = "outputMessage";
 
    public JSONRequest() {
        super("JSONRequest");
    }
    
    protected void onHandleIntent(Intent intent) {
    	 
        //Get Intent extras that were passed
        inMessage = intent.getStringExtra(IN_MSG);
        if(inMessage.trim().equalsIgnoreCase("getCountryInfo")){
            String countryCode = intent.getStringExtra("countryCode");
            getCountryInfo(countryCode);
        }
        else if(inMessage.trim().equalsIgnoreCase("getSomethingElse")){
            //you can choose to implement another transaction here
        }
 
    }
 
    private void getCountryInfo(String countryCode) {
 
        //prepare to make Http request 
        String url = "http://10.0.2.2:8080/AndroidJSONWebService" + "/CreerCompteServlet";
        
        //add name value pair for the country code
        List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(1);
        nameValuePairs.add(new BasicNameValuePair("countryCode",countryCode));
        String response = sendHttpRequest(url,nameValuePairs);
 
        //broadcast message that we have received the reponse 
        //from the WEB Service
        Intent broadcastIntent = new Intent();
        broadcastIntent.setAction(MyRequestReceiver.PROCESS_RESPONSE);
        broadcastIntent.addCategory(Intent.CATEGORY_DEFAULT);
        broadcastIntent.putExtra(IN_MSG, inMessage);
        broadcastIntent.putExtra(OUT_MSG, response);
        sendBroadcast(broadcastIntent);
    }
 
    private String sendHttpRequest(String url, List<NameValuePair> nameValuePairs) {
 
        int REGISTRATION_TIMEOUT = 15 * 1000;
        int WAIT_TIMEOUT = 60 * 1000;
        HttpClient httpclient = new DefaultHttpClient();
        HttpParams params = httpclient.getParams();
        HttpResponse response;
        String content =  "";
        
        try {
 
            //http request parameters
            HttpConnectionParams.setConnectionTimeout(params, REGISTRATION_TIMEOUT);
            HttpConnectionParams.setSoTimeout(params, WAIT_TIMEOUT);
            ConnManagerParams.setTimeout(params, WAIT_TIMEOUT);
 
            //http POST
            HttpPost httpPost = new HttpPost(url);
            httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs)); 
 
            //send the request and receive the repponse
            response = httpclient.execute(httpPost);
 
            StatusLine statusLine = response.getStatusLine();
            if(statusLine.getStatusCode() == HttpStatus.SC_OK){
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                response.getEntity().writeTo(out);
                out.close();
                content = out.toString();
            }
 
            else{
                //Closes the connection.
                Log.w("HTTP1:",statusLine.getReasonPhrase());
                response.getEntity().getContent().close();
                throw new IOException(statusLine.getReasonPhrase());
            }
 
        } catch (ClientProtocolException e) {
            Log.w("HTTP2:",e );
        } catch (IOException e) {
            Log.w("HTTP3:",e );
        }catch (Exception e) {
            Log.w("HTTP4:",e );
        }
 
        //send back the JSON response String
        return content;
 
    }
}
