import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva a temperatura em celsius para a conversão:");
        double celsius = sc.nextInt();

        double fahrenheit = celsius * 9/5 + 32;
        System.out.println(celsius + " ºC" + " = " + fahrenheit + " ºF");
    }
}
