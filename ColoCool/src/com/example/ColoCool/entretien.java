package com.example.ColoCool;


import com.example.projet.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class entretien extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.entretien);
		Button ajoutliste = (Button) findViewById(R.id.button1);
		ajoutliste.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(entretien.this,creationliste2.class));
		
				
			}
		});
	}}