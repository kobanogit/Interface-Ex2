package com.ex.gestion;

public class Vendeur extends Commercial{

	private static double pourcentVendeur = 0.2;
	private static int bonus = 400;
	
	public Vendeur(String prenom, String nom, int age, String dateEntree, double chiffreAffaire) {
		super(prenom, nom, age, dateEntree, chiffreAffaire);
	}

	@Override
	public double calculerSalaire() {
		return (getChiffreAffaire() * pourcentVendeur) + bonus;
	}
	
	public String getTitre() {
		return "Le vendeur ";
	}
	
}
