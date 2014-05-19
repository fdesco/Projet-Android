package com.example.ColoCool;


import com.example.projet.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class malistedecourses extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.liste);
		Button creerliste = (Button) findViewById(R.id.button1);
		creerliste.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(malistedecourses.this,creationliste.class));
	}});
		Button modifierliste = (Button) findViewById(R.id.button2);
		modifierliste.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(malistedecourses.this,modificationliste.class));
	}});
		Button retourmenu = (Button) findViewById(R.id.button3);
		retourmenu.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(malistedecourses.this,menu.class));
	}});
		Button consultation = (Button) findViewById(R.id.button4);
		consultation.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(malistedecourses.this,consultationliste.class));
	}});
	}}