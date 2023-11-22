package trab_QaManzano;

import java.util.Scanner;

public class Exe_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String escolha = "";
		double tot = 0;
		int cont =0;
		do {
			System.out.println("Me informe o nome desse comodo da sua casa ");
				String comodo = sc.next();
			System.out.println("Me informe a largura desse comodo");
				double larg = sc.nextDouble();
			System.out.println("Agora me informe a Altura desse comodo");
				double alt = sc.nextDouble();
				double area = alt*larg; 
			System.out.println("A arêa do comodo "+comodo+" é "+area);
				tot += area;
				cont++;
			System.out.println("Gostaria de adicionar mais algum comodo\n[S] Ou [N]? :");
				escolha = sc.next();	
				
			}while(escolha.toLowerCase().equals("s"));
		System.out.println("Com um total de "+cont+"\n esse seria o total acumulado em área de :"+tot);
		sc.close();
	}

}
