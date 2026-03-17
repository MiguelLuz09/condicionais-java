import java.util.Scanner;

public class NumRomano {
    public static void main (String[] args){
        Scanner scanner =  new Scanner(System.in);

        System.out.println("informe um número para ser traduzido para número romano:  ");
        int escolha = scanner.nextInt();

    switch (escolha) {
        case 1:
            System.out.println("é I");
            break;
        case 2:
            System.out.println("é II");
            break;
        case 3:
            System.out.println("é III");
            break;
        case 4:
            System.out.println("é IV");
            break;
        case 5:
            System.out.println("é V");
            break;
        case 6:
            System.out.println("é VI");
            break;
        case 7:
            System.out.println("é VII");
            break;
        case 8:
            System.out.println("é VIII");
            break;
        case 9:
            System.out.println("é IX");
            break;
        case 10:
            System.out.println("é X");
            break;
    }
        scanner.close();

    }
}