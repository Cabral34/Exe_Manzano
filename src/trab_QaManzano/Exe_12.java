package trab_QaManzano;

import java.util.Scanner;

public class Exe_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 0;
		int mv = 0;
		do {
			System.out.println("me informe um numero positivo ou negativo inteiro"+"\nPs:(Caso o numero seja negativo o codigo ira parar)"+"\nNumero:");
				n1 = sc.nextInt();
				if(mv<n1){
					mv=n1;
				}
		}while(n1>=0);
			System.out.println("O maior numero informado foi "+mv+"\nE o menor numero foi "+n1);
		sc.close();
	}

}
