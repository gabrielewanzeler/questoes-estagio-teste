//questao 5

import java.util.Scanner;


public class QuestaoInverterString {
    public static String inverterString(String string) {
        String stringInvertida = "";

        for (int i = string.length() - 1; i >= 0; i--) {

            stringInvertida += string.charAt(i);
        }
        return stringInvertida;
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Digite uma string para inverter: ");
            String stringOriginal = scanner.nextLine();
            
            String stringInvertida = inverterString(stringOriginal);
            
            System.out.println("String original: " + stringOriginal);
            System.out.println("String invertida: " + stringInvertida);
        }
    }
}
