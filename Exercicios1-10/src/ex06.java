import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        double x = scanner.nextDouble();

        double resultado = Math.sqrt(Math.cbrt(x - 0.5));
        System.out.printf("O valor de y é: %.3f%n", resultado);
    }
}