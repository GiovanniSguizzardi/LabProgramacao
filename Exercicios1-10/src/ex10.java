import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número binário de 4 bits (ex: 1010): ");
        String binario = scanner.nextLine();

        if (binario.matches("[01]{4}")) {
            int decimal = Integer.parseInt(binario, 2);
            System.out.println("Valor decimal: " + decimal);
        } else {
            System.out.println("Entrada inválida. Digite 4 dígitos binários (0's ou 1's).");
        }
    }
}