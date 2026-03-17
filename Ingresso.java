import java.util.Scanner;

public class Ingresso {
    public static void main (String[] args){
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Bem vindo ao cinema!, informe sua idade: ");
        int idade = scanner.nextInt();

        String resultado = ( idade <= 12 )? "voce pagará 12 reais de ingresso" :
        (idade >= 12 && idade <= 60 ) ? "voce pagará 20 reais" : "voce pagará 10 reais"; 

        System.out.println(resultado);

        scanner.close();

    }
}
