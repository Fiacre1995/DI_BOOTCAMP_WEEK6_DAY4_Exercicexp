package com.exercicexp;


public class Exercice_xp1 {

	// Attributs de classe

	private String name;
	private int roll_no;

	// Constructeur sans parametre
	
	public Exercice_xp1() {
		super();
	}
	
	// Constructeur avec parametre
	
	
	public Exercice_xp1(String name, int roll_no) {
		super();
		this.name = name;
		this.roll_no = roll_no;
	}


	// Getters et Setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	

	
	// Methode Main 
	
	public static void main(String[] args) {
		
		Exercice_xp1 etudiant = new Exercice_xp1("Dion", 2);
		System.out.println(etudiant.name);
		System.out.println(etudiant.roll_no);

	}

	

}
