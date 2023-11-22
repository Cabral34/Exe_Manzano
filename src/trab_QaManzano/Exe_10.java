package trab_QaManzano;

public class Exe_10 {

	public static void main(String[] args) {
		int sm = 0;
		int j = 0;
		for( int i=50; i<71; i++) {
			if (i%2==0) {
				System.out.println(i);
				sm = sm + i;
				j++;
			}
			
		}
		System.out.println("A soma Te todos os numeros pares entre 50 e 70 é "+sm+"\nE a media aritimetica deles é "+sm/j);
	}

}
