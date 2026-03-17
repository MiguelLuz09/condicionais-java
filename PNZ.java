import java.util.Scanner;

public class PNZ {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = scanner.nextInt();

        String resultado = (num > 0) ? "Positivo" : (num < 0) ? "Negativo" : "Zero";

        System.out.println("O seu número é " + resultado);

        scanner.close();
    }
}