package com.example.ColoCool;


import com.example.projet.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ajoutdepense extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ajouterdepense);
		Button valider = (Button) findViewById(R.id.button1);
		valider.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(ajoutdepense.this,mesdepenses.class));
	}});
		Button retour = (Button) findViewById(R.id.button2);
		retour.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(ajoutdepense.this,mesdepenses.class));
	}});
	}}