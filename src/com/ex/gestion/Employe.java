package com.ex.gestion;

public abstract class Employe {
	

	private String nom, prenom, dateEntree;
	private int age;

	public Employe(String prenom, String nom, int age, String dateEntree) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateEntree = dateEntree;
		this.age = age;
	}
	
	public abstract double calculerSalaire ();
	
	public String getTitre() {
		return "L'employé ";
	}
	
	public String getNom() {
		return getTitre() + prenom + " " + nom;
	}
}
