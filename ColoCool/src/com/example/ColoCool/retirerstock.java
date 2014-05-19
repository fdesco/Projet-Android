package com.example.ColoCool;


import com.example.projet.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class retirerstock extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.retirer);
		Button parscan = (Button) findViewById(R.id.button1);
		parscan.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(retirerstock.this,retirerstockscan.class));
	}});
		Button parliste = (Button) findViewById(R.id.button2);
		parliste.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(retirerstock.this,retirerstockliste.class));
	}});
		Button retour = (Button) findViewById(R.id.button3);
		parscan.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(retirerstock.this,messtocks.class));
	}});
	}}