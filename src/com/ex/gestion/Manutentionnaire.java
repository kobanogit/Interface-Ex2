package com.ex.gestion;

public class Manutentionnaire extends Employe{

	private final static double SALAIRE_HORAIRE = 65;
	private int heures;
	
	public Manutentionnaire(String prenom, String nom, int age, String dateEntree, int heures) {
		super(prenom, nom, age, dateEntree);
		this.heures = heures;
	}

	@Override
	public double calculerSalaire() {
		// TODO Auto-generated method stub
		return (SALAIRE_HORAIRE * heures);
	}
	
	public String getTitre() {
		return "Le manutentionnaire ";
	}
	
}
