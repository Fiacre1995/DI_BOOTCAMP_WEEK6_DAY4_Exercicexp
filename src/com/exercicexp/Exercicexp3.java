package com.exercicexp;

public class Exercicexp3 {

	//Attributs 
	
		private double longueur;
		private double largeur;
		
		
		//constructeur sans parametre
		
		public Exercicexp3() {
			super();
		}
		
		//Constructeur avec parametre
		
		public Exercicexp3(double longueur, double largeur) {
			super();
			this.longueur = longueur;
			this.largeur = largeur;
		}

		
		//Getters et Setters
		
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

		
		//Metodes
		
		
		public double aire(){
			
			return (longueur * largeur);
		}


		//Main

		public static void main(String[] args) {
			
			Exercicexp3 rectangle1 = new Exercicexp3(4, 5);
			System.out.println(rectangle1.aire());
			
			Exercicexp3 rectangle2 = new Exercicexp3(5, 8);
			System.out.println(rectangle2.aire());
			
			
		}

		

}
