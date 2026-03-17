import java.util.Scanner;

public class Conceito {
    public static void main (String[] args){
        Scanner scanner =  new Scanner(System.in);

        System.out.println("digite a nota do aluno");
        double nota = scanner.nextDouble();

        if (nota >= 9) {
            System.out.println("A");
        } 
        else if (nota >= 7 && nota <= 8) { 
            System.out.println("B");
        } 
        else if (nota >= 5 && nota <= 6){
            System.out.println("C");
        }else if (nota >= 0 && nota <= 4){
            System.out.println("D");
        }

        scanner.close();

    }
}
