package com.ex.gestion;

public class ManutARisque extends Manutentionnaire implements ARisque {
	
	public ManutARisque(String prenom, String nom, int age, String dateEntree, int heures) {
		super(prenom, nom, age, dateEntree, heures);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculerSalaire() {
		// TODO Auto-generated method stub
		return super.calculerSalaire() + PRIME;
	}
	
}
