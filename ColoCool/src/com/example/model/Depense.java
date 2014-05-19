package com.example.model;

public class Depense {

	
	int NumeroDepense; 
	float Montant; 
	int NumeroColoc;
		
		
		public Depense(int NumeroDepense, float Montant, int NumeroColoc) {
		super();
		this.NumeroDepense = NumeroDepense;
		this.Montant = Montant;
		this.NumeroColoc = NumeroColoc;
		}
		public int getNumeroDepense() {
		return NumeroDepense;
		}
		public void setNumeroDepense(int NumeroDepense) {
		this.NumeroDepense = NumeroDepense;
		}
	
		public float getMontant() {
		return Montant;
		}
		public void setMontant(float Montant) {
		this.Montant = Montant;
		}
		
		public int getNumeroColoc() {
			return NumeroDepense;
			}
			public void setNumeroColoc(int NumeroColoc) {
			this.NumeroColoc = NumeroColoc;
			}
		}
	

