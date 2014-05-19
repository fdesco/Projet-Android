package com.example.ColoCool;

import com.example.projet.R;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.support.v4.app.NavUtils;
import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

public class Inscription extends Activity {
	
	private MyRequestReceiver receiver;
    private Button creerUt;
    private EditText Nom;
    private EditText Mail;
    private EditText Login;
    private EditText Mdp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sinscrire);
		// Show the Up button in the action bar.
		setupActionBar();
		
		IntentFilter filter = new IntentFilter(MyRequestReceiver.PROCESS_RESPONSE);
        filter.addCategory(Intent.CATEGORY_DEFAULT);
        receiver = new MyRequestReceiver();
        registerReceiver(receiver, filter);
	
	
	creerUt = (Button) findViewById(R.id.sinscrire);
    creerUt.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view) {
            getUtilisateurInformation();
            //hide the soft keyboard
            InputMethodManager mgr = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            mgr.hideSoftInputFromWindow(Nom.getWindowToken(), 0);
            
        }
    });
	}

	protected void onDestroy() {
        Log.v("AndroidJSONTutorialActivity", "onDestory");
        
        unregisterReceiver(receiver);
        super.onDestroy();
    }
    
    private void getUtilisateurInformation() {
 
        boolean internet =  isNetworkAvailable(this);
        if(internet){
            String nom = Nom.getText().toString();
            //if no country code was entered
            if(nom.isEmpty()){
                Toast toast = Toast.makeText(this, "Veuillez entrer votre nom", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP, 105, 50);
                toast.show();
            }
            else {
                //pass the request to your service so that it can 
                //run outside the scope of the main UI thread
                Intent msgIntent = new Intent(this, JSONRequest.class);
                msgIntent.putExtra(JSONRequest.IN_MSG, "getUtilisateurInfo");
                msgIntent.putExtra("nom",nom);
                startService(msgIntent);
            }
        }
    }
    
    private boolean isNetworkAvailable(Context context) {
        ConnectivityManager connectivity = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity != null) {
            NetworkInfo[] info = connectivity.getAllNetworkInfo();
            if (info != null) {
                for (int i = 0; i < info.length; i++) {
                    Log.w("INTERNET:",String.valueOf(i));
                    if (info[i].getState() == NetworkInfo.State.CONNECTED) {
                        Log.w("INTERNET:", "connected!");
                        return true;
                    }
                }
            }
        }
        return false;
    }
	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sinscrire, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public class MyRequestReceiver extends BroadcastReceiver{
		 
        public static final String PROCESS_RESPONSE = "com.as400samplecode.intent.action.PROCESS_RESPONSE";
 
        
        public void onReceive(Context context, Intent intent) {
 
            String response = null;
            String responseType = intent.getStringExtra(JSONRequest.IN_MSG);
            
            if(responseType.trim().equalsIgnoreCase("getCountryInfo")){
                response = intent.getStringExtra(JSONRequest.OUT_MSG);
                
            }
            else if(responseType.trim().equalsIgnoreCase("getSomethingElse")){
                //you can choose to implement another transaction here
            }
 
        }
    }

}
