import java.util.Scanner;

public class ParImpar {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe um numero ");
    int num = scanner.nextInt();

    String resultado = ( num % 2 != 0 ) ? "o numero é par" : "o numero é impar";

    System.out.println("O numero é "+ resultado);

    scanner.close();

 }
}