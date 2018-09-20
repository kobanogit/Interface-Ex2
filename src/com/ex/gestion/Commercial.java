package com.ex.gestion;

abstract class Commercial extends Employe {
	
	private double chiffreAffaire;
	
	public Commercial(String prenom, String nom, int age, String dateEntree, double chiffreAffaire) {
		super(prenom, nom, age, dateEntree);
		this.chiffreAffaire = chiffreAffaire;
	}

	public double getChiffreAffaire() {
		return chiffreAffaire;
	}
		
}
