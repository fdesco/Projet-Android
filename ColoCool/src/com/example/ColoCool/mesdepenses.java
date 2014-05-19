package com.example.ColoCool;


import com.example.projet.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class mesdepenses extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mesdepenses);
		Button ajoutdepense = (Button) findViewById(R.id.button1);
		ajoutdepense.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(mesdepenses.this,ajoutdepense.class));
	}});
		Button equilibre = (Button) findViewById(R.id.button2);
		equilibre.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(mesdepenses.this,equilibre.class));
	}});
		Button retourmenu = (Button) findViewById(R.id.button3);
		retourmenu.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(mesdepenses.this,menu.class));
	}});	
	}}