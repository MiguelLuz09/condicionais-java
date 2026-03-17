import java.util.Scanner;

public class Media {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite a nota do aluno");
        double num1 = scanner.nextDouble();

        if (num1 >= 7) {
            System.out.println("aprovado");
        } 
        else if (num1 >= 5 && num1 < 7) { 
            System.out.println("Recuperação");
        } 
        else {
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}

