package trab_QaManzano;

public class Exe_07 {

	public static void main(String[] args) {
		int n = 15; // Número de termos desejados

        // Inicializando os dois primeiros termos
        int primeiroTermo = 1;
        int segundoTermo = 1;

        System.out.println("Série de Fibonacci até o décimo quinto termo:");

        // Imprimindo os dois primeiros termos
        System.out.print(primeiroTermo + ", " + segundoTermo);

        // Calculando e imprimindo os termos subsequentes
        for (int i = 3; i <= n; i++) {
            int proximoTermo = primeiroTermo + segundoTermo;
            System.out.print(", " + proximoTermo);

            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
	}

}
