package trab_QaManzano;

import java.util.Scanner;

public class Exe_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0; 
		int n1;
		int n2 = 0;
		
		do {
			i++;
			System.out.println("Me informe a " +i+ " Nota por favor");
			 n1 = sc.nextInt();
			  n2 = n2 + n1;
			  
		}while(n1>=0 && i<10); 
		 System.out.println("O total da suas notas foram: "+n2+"\nE a media foi: "+n2/10);
		sc.close();
	}

}
