package com.example.ColoCool;


import com.example.projet.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class creationliste extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.creationliste);
		Button fruitsetlegumes = (Button) findViewById(R.id.button2);
		fruitsetlegumes.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(creationliste.this,fruitsetlegumes.class));
	}});
		Button epicerie = (Button) findViewById(R.id.button3);
		epicerie.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(creationliste.this,epicerie.class));
	}});
		Button conserves = (Button) findViewById(R.id.button4);
		conserves.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(creationliste.this,conserves.class));
	}});
		Button petitdejgouter = (Button) findViewById(R.id.button5);
		petitdejgouter.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(creationliste.this,petitdejgouter.class));
	}});
		Button viandesetpoissons = (Button) findViewById(R.id.button6);
		viandesetpoissons.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(creationliste.this,viandesetpoissons.class));
	}});
		Button cremerie = (Button) findViewById(R.id.button7);
		cremerie.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(creationliste.this,cremerie.class));
	}});
		Button hygieneetpharmacie = (Button) findViewById(R.id.button8);
		hygieneetpharmacie.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(creationliste.this,hygieneetpharmacie.class));
	}});
		Button entretien = (Button) findViewById(R.id.button9);
		entretien.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(creationliste.this,entretien.class));
	}});
		Button menu = (Button) findViewById(R.id.button10);
		menu.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				startActivity(new Intent(creationliste.this,menu.class));
	}});
	}}