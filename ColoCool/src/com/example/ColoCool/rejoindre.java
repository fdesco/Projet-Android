package com.example.ColoCool;


import com.example.projet.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class rejoindre extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.rejoindre);
	    Button creation = (Button) findViewById(R.id.button2);
		creation.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(rejoindre.this,creationcolocool.class));
	}});
		 Button connexioncolocool = (Button) findViewById(R.id.button1);
			connexioncolocool.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View v) {
					startActivity(new Intent(rejoindre.this,menu.class));
					}});
			Button retour = (Button) findViewById(R.id.button3);
			retour.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View v) {
					startActivity(new Intent(rejoindre.this,Main.class));
		}});
}}
