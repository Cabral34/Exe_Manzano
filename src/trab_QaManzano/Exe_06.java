package trab_QaManzano;

import java.util.Scanner;

public class Exe_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Me informe a base da sua potencia por favor ");
		int B = sc.nextInt();
		System.out.println("Agora me informe o expoente da sua potencia");
		int E = sc.nextInt();
		int C=B;
		for( int i=1; i<=E; i++) {
				C = C*B;
			System.out.println(C);
		}
		System.out.println("O valor final de "+B+"^"+E+"\nÉ: "+C);
		sc.close();
	}

}
