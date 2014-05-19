package com.example.ColoCool;


import com.example.projet.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class equilibre extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.equilibre);
		Button balance = (Button) findViewById(R.id.button1);
		balance.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(equilibre.this,equilibre.class));
	}});
		Button commentequilibrer = (Button) findViewById(R.id.button2);
		commentequilibrer.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(equilibre.this,equilibre.class));
	}});
		Button ajoutdepense = (Button) findViewById(R.id.button3);
		ajoutdepense.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(equilibre.this,mesdepenses.class));
	}});
	}}