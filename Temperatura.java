import java.util.Scanner;

    public class Temperatura{
        public static void main (String[] args){
         Scanner scanner = new Scanner (System.in);

        System.out.println("insira a temperatura ");
        int temperatura = scanner.nextInt();

        String temp2 = ( temp1 <= 15 ) ? "Frio" : (temperatura >= 15 && temperatura <= 25  ) ? "Agradável" : "Quente";
        System.out.println("a temperatura faz o clima estar um tanto quanto "+ temp2);

        scanner.close();
    }
}