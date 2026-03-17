import java.util.Scanner;

public class Triângulo {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro lado: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o valo do segundo lado: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o valo do terceiro lado: ");
        double c = scanner.nextDouble();

        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("É um triângulo válido!");
        }
        
            if (a == b && b == c && c == a) {
                System.out.println("Tipo: Equilátero ");
            } else if (a == b || a == c || b == c) {
                System.out.println("Tipo: Isósceles");
            } else if (a != b && b != c && c != a){
                System.out.println("Tipo: Escaleno");
            }

        scanner.close();
    }

}