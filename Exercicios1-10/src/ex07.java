import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        double x = scanner.nextDouble();

        double numerador = Math.pow(x, 4) - 1;
        double denominador = 2 * Math.pow(x, 2);
        double fracaoElevadaAoQuadrado = Math.pow(numerador / denominador, 2);

        double y = Math.sqrt(1 + fracaoElevadaAoQuadrado) - (Math.pow(x, 2) / 2);

        System.out.printf("O valor de y é: %.3f%n", y);
    }
}