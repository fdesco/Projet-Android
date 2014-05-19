package com.example.ColoCool;


import com.example.projet.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class menu extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		Button mesdepenses = (Button) findViewById(R.id.button1);
		mesdepenses.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(menu.this,mesdepenses.class));
	}});
		Button malistedecourses = (Button) findViewById(R.id.button2);
		malistedecourses.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(menu.this,malistedecourses.class));
	}});
		Button messtocks = (Button) findViewById(R.id.button3);
		messtocks.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(menu.this,messtocks.class));
	}});
		Button monprofil = (Button) findViewById(R.id.button4);
		monprofil.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(menu.this,monprofil.class));
	}});
		Button retour = (Button) findViewById(R.id.button5);
		retour.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(menu.this,rejoindre.class));
	}});
	}}