import java.util.Scanner;
import static java.lang.System.exit;

public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva seu número de 03 caracteres: ");
        String numero = sc.nextLine();

        if (numero.length() > 3 ){
            System.out.println("[ERRO] Número com mais de 3 caracteres");
            exit(0);
        } else {
            int posicaoUltimoEspaco = numero.lastIndexOf(" ");
            String primeiraLetraUltimoNome = numero.substring(posicaoUltimoEspaco + 3);
            System.out.println("Valor da dezena: " + primeiraLetraUltimoNome);
            exit(0);
        }
    }
}
