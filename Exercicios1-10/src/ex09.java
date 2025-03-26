import java.util.Scanner;

import static java.lang.System.exit;

public class ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva seu número de 03 caracteres: ");
        String numero = sc.nextLine();

        if (numero.length() > 3 ){
            System.out.println("[ERRO] Número com mais de 3 caracteres");
            exit(0);
        } else {
            System.out.println("Número invertido: " + new StringBuilder(numero).reverse());
            exit(0);
        }
    }
}