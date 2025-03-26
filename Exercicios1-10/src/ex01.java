import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da base do retângulo: ");
        double base = sc.nextDouble();
        System.out.println("Digite o valor da altura do retângulo: ");
        double altura = sc.nextDouble();

        double area = base*altura;
        double perimetro = 2 * base + 2 * altura;
        System.out.println("O valor do perímetro é: "+perimetro+", a área é: "+area);
    }
}
