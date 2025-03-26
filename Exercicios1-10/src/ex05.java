import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("O usuário deve fornecer o valor da hora aula: ");
        double horaaula = sc.nextDouble();
        System.out.println("O usuário deve fornecer as horas trabalhadas: ");
        int horatrabalhada = sc.nextInt();
        System.out.println("O usuário deve fornecer o desconto do INSS: ");
        int desconto = sc.nextInt();

        double salario_bruto = horaaula * horatrabalhada;
        double descontoINSS = salario_bruto * ((double) desconto /100);
        double salario_liquido = salario_bruto - descontoINSS;

        System.out.println("A) Valor do salário bruto -> " + salario_bruto);
        System.out.println("B) Valor que será descontado do INSS -> " + descontoINSS);
        System.out.println("C) Valor do salário líquido mensal -> " + salario_liquido);
        System.out.println("D) Valor do salário líquido com duas casas decimais -> " + String.format("%.2f", salario_liquido));
    }
}