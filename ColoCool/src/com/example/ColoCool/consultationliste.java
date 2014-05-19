package com.example.ColoCool;


import com.example.projet.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class consultationliste extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.consultationliste);
		Button retour = (Button) findViewById(R.id.button1);
		retour.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(consultationliste.this,malistedecourses.class));
	}});
		Button consulter = (Button) findViewById(R.id.button2);
		consulter.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(consultationliste.this,consultationliste2.class));
	}});
	}}