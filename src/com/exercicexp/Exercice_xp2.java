package com.exercicexp;


public class Exercice_xp2 {

	// Attribut
	
		private int coté1;
		private int coté2;
		private int coté3;
	 
		// Constructeur sans parametre
		
		public Exercice_xp2() {
			this.coté1 = 3;
			this.coté2 = 4;
			this.coté3 = 5;
		}


		// Constructeur avec parametres : non nécessaire
		
		
		//Getter et Setters
		
		public int getCoté1() {
			return coté1;
		}


		public void setCoté1(int coté1) {
			this.coté1 = coté1;
		}


		public int getCoté2() {
			return coté2;
		}


		public void setCoté2(int coté2) {
			this.coté2 = coté2;
		}


		public int getCoté3() {
			return coté3;
		}


		public void setCoté3(int coté3) {
			this.coté3 = coté3;
		}
		
		
		//Methodes 
		
		public double perimetre() {
			return coté1 + coté2 + coté3;
		}

		public double Aire() {
			return (coté1 * coté2) / 2.0;
		}

		
		// Main
		
		public static void main(String[] args) {
			
			Exercice_xp2 triangle = new Exercice_xp2();
			System.out.println(triangle.perimetre());
			System.out.println(triangle.Aire());
			
		}

}
