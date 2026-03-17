import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("informe o primeiro número ");
        double n1 = scanner.nextDouble();

        System.out.println("informe o segundo numero");
        double n2 = scanner.nextDouble();

        
        System.out.println("informe a operação desejada: (1:Soma, 2:Subtração, 3:Multiplicação, 4:Divisão): ");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("o resultado da soma é "+ (n1+n2));
                break;

            case 2:

                System.out.println("o resultado da subtração é "+ (n1-n2));
                break;

            case 3:

                System.out.println("o resultado da multiplicação é "+ (n1*n2));
                break;

            case 4:
                if (n1 == 0 || n2 == 0) {
                    System.out.println("impossível fazer a divisão");
                } else {
                    System.out.println("o resultado da divisão é "+ (n1/n2));
                }
                break;
        }
        
        scanner.close();
    }
}