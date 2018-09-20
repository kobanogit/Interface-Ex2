package com.ex.gestion;

public class TechnARisque extends Technicien implements ARisque{
	
	public TechnARisque(String prenom, String nom, int age, String dateEntree, int unite) {
		super(prenom, nom, age, dateEntree, unite);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculerSalaire() {
		// TODO Auto-generated method stub
		return super.calculerSalaire() + PRIME;
	}

}
