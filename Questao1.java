import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[9];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite 9 numeros inteiros: ");
            System.out.print((i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();
        }


        System.out.println("Abaixo cada posição e seu respectivo número primo:");

        for (int i = 0; i < vetor.length; i++) {
            if (verificaPrimo(vetor[i])) {
                System.out.println("Posição: " + i + " . Número primo: " + vetor[i]);
            }
        }
        scanner.close();
    }


    public static boolean verificaPrimo(int numero) {
        if (numero <= 1) {
            return false;

        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;

            }
        }
        return true;
    }
}
