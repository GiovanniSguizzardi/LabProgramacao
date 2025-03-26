import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        double tempo = scanner.nextDouble();
        System.out.print("Digite a velocidade média durante a viagem (em km/h): ");
        double velocidade = scanner.nextDouble();

        double distancia = tempo * velocidade;
        double consumo = distancia / 10.5;

        System.out.println("A) Distância percorrida: " + distancia);
        System.out.printf("B) Quantidade de combustível gasta: "+ consumo);
    }
}
