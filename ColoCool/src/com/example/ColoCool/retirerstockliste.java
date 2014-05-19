package com.example.ColoCool;


import com.example.projet.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class retirerstockliste extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.retirerstockliste);
		Button valider = (Button) findViewById(R.id.button1);
		valider.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(retirerstockliste.this,retirerstock.class));
	}});
		Button recommencer = (Button) findViewById(R.id.button2);
		recommencer.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(retirerstockliste.this,retirerstockliste.class));
	}});
	}}