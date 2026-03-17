import java.util.Scanner;

public class MultiploDe3e5 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("informe um numero ");
        int num1 = scanner.nextInt();


        String resultado = ( num1 % 3 == 0  && num1 % 5 == 0 )? "o numero é multiplo de 3 e de 5" : 
        (num1 % 3 == 0)? "o numero é multiplo por 3 mas nao por 5" :
        (num1 % 5 == 0)? "o numero é multiplo por 5 mas nao por 3" : "o numero nao é multiplo de 3 e nem de 5";

        System.out.println(resultado);

        scanner.close();

    }
}