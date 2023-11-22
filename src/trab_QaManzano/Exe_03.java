package trab_QaManzano;

public class Exe_03 {

	public static void main(String[] args) {
		int sm = 0;
		for( int i=1; i<500; i++) {
			if (i%2==0) {
				sm = sm + i;
			}
			
		}
		System.out.println("A soma Te todos os numeros pares entre 1 e 500 é "+sm);


	}

}
