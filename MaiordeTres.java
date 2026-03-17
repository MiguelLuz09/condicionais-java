import java.util.Scanner;

public class MaiordeTres {
    public static void main (String[] args){
        Scanner scanner =  new Scanner(System.in);

        System.out.println("informe o primeiro numero: ");
        int n1 = scanner.nextInt();

        System.out.println("informe o segundo numero numero: ");
        int n2 = scanner.nextInt();

        System.out.println("informe o terceiro numero: ");
        int n3 = scanner.nextInt();

        String resultado = ( n1 > n2  && n1 > n3)? "o primeiro numero é maior do que os outros" :
        (n2 > n1 && n2 > n3)? "o segundo numero é maior" :
        (n3 > n1 && n3 > n2)? "o terceiro numero é maior" : "todos sao iguais";

        System.out.println(resultado);

      scanner.close();

    }
}