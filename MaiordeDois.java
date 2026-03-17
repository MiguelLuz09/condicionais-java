import java.util.Scanner;

public class MaiordeDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro numero ");
        int num1 = scanner.nextInt();

        System.out.println("Informe o segundo numero ");
        int num2 = scanner.nextInt();

        String num3 = ( num1 >= num2 ) ? "o primeiro numero é maior que o segundo ou igual" : "o segundo numero é maior primeiro ou igual ";

        System.out.println(num3);

        scanner.close();

    }
}