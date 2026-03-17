import java.util.Scanner;

public class EstacaoPorMes {
    public static void main (String[] args){
        Scanner scanner =  new Scanner(System.in);

        System.out.println("informe um mês(de forma numérica) para ser convertido para estação do ano: ");
        int Estacao = scanner.nextInt();

    switch (Estacao) {
        case 3: case 4: case 5:
            System.out.println("é outono");
            break;
        case 6: case 7: case 8:
            System.out.println("é inverno");
            break;
        case 9: case 10: case 11:
            System.out.println("é primavera");
            break;
        case 12: case 1: case 2:
            System.out.println("é verão");
            break;
    }
        scanner.close();

    }
}