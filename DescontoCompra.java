import java.util.Scanner;

public class DescontoCompra {
    public static void main (String[] args){
        double total1;
        double total2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("informe o valor da compra ");
        double valorCompra = scanner.nextInt();
        
        if (valorCompra >= 500) {
            total1 = ( valorCompra * 0.2);
            total2 = (valorCompra - total1);
            System.out.println("o valor da compra sem desconto é "+ valorCompra + " e o valor com desconto é " + total2);
        } 
        else if (valorCompra >= 200 && valorCompra <= 500) { 
            total1 = ( valorCompra * 0.1);
            total2 = (valorCompra - total1);
            System.out.println("o valor da compra sem desconto é "+ valorCompra + " e o valor com desconto é " + total2);
        } 
        else if (valorCompra <= 200){
            System.out.println("nao tem desconto");
        }
        scanner.close();

    }
}