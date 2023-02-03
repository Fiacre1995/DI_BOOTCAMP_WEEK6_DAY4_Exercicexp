package com.exercicexp;

import java.util.Scanner;

public class Exercicexp4 {

	// Attributs

	private double longueur;
	private double largeur;

	// constructeur sans parametre

	public Exercicexp4() {
		super();
	}

	// Constructeur avec parametre

	public Exercicexp4(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	// Getters et Setters

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	// Metodes

	public double aire() {

		return (longueur * largeur);
	}

	// Main

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Veuillez entrez un nombre ");
		double longueur = scanner.nextDouble();

		System.out.println("Veuillez entrez un nombre ");
		double largeur = scanner.nextDouble();

		Exercicexp3 rectangle1 = new Exercicexp3(longueur, largeur);
		System.out.println("Aire du rectangle est : " + rectangle1.aire());

	}

}
