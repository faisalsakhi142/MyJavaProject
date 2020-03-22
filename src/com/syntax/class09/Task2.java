package com.syntax.class09;

public class Task2 {

	public static void main(String[] args) {
		for(int Rstar=1; Rstar<=5; Rstar++) {
			for(int Cstar=1; Cstar<=Rstar; Cstar++) {
				System.out.print("*");
			}
			System.out.println();
		}for(int Rstar=1; Rstar<=5; Rstar++) {
			for(int Cstar=5; Cstar>Rstar; Cstar--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
