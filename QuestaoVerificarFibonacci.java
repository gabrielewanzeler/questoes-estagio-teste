//questao 2

import java.util.Scanner;

public class QuestaoVerificarFibonacci {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Digite um número para verificar se ele pertence à sequência de Fibonacci: ");
            int numero = scanner.nextInt();
            int a = 0, b = 1;

            while (b < numero) {
                int temp = b;
                b = a + b;
                a = temp;
            }
            
            if (b == numero) {
                System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
            }
            else {
                System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
            }
        }
    }
}