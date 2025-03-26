import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: R$ ");
        double salarioMinimo = scanner.nextDouble();
        System.out.print("Digite a quantidade de quilowatts consumidos: ");
        double quilowattsConsumidos = scanner.nextDouble();

        double valor100Kw = salarioMinimo / 7;
        double valorPorKw = valor100Kw / 100;
        double valorTotal = quilowattsConsumidos * valorPorKw;
        double valorComDesconto = valorTotal * 0.90;

        System.out.println("A) Valor de cada quilowatt: " + valorPorKw);
        System.out.println("B) Valor total a ser pago: " + valorTotal);
        System.out.println("C) Valor com 10% de desconto: " + valorComDesconto);
    }
}
