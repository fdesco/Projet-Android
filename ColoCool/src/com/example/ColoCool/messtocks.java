package com.example.ColoCool;


import com.example.projet.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class messtocks extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.messtocks);
		Button ajouterstock = (Button) findViewById(R.id.button1);
		ajouterstock.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(messtocks.this,ajoutstock.class));
	}});
		Button modifierstock = (Button) findViewById(R.id.button2);
		modifierstock.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(messtocks.this,retirerstock.class));
	}});
		Button consulterstock = (Button) findViewById(R.id.button3);
		consulterstock.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(messtocks.this,consultationstock.class));
	}});
		Button retour = (Button) findViewById(R.id.button4);
		retour.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(messtocks.this,menu.class));
	}});
	}}