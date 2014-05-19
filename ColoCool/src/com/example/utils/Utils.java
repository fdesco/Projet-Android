package com.example.utils;




import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.util.Log;

public class Utils {
	private static final String TAG = "com.example.utils";

	public static String convertInputStreamToString(InputStream is) {
		final StringBuilder sb = new StringBuilder();
		try {
			final BufferedReader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			String line = null;
			while ((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}
			is.close();
		} catch (Exception e) {
			Log.e(TAG, "Error converting result " + e.toString());
		}
		return sb.toString();
	}
}