import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Jogador 1 (pedra, papel ou tesoura): ");
        String j1 = scanner.nextLine();

        System.out.print("Jogador 2 (pedra, papel ou tesoura): ");
        String j2 = scanner.nextLine();

        int p1 = 0;
        int p2 = 0;

        switch (j1) {
            case "pedra":
                p1 = 1;
                break;
            case "papel":
                p1 = 2;
                break;
            case "tesoura":
                p1 = 3;
                break;
        }

        switch (j2) {
            case "pedra":
                p2 = 1;
                break;
            case "papel":
                p2 = 2;
                break;
            case "tesoura":
                p2 = 3;
                break;
        }

        int vencedor;

        if (p1 == p2) {
            vencedor = 0;
        } else if ((p1 == 1 && p2 == 3) || (p1 == 2 && p2 == 1) || (p1 == 3 && p2 == 2)) {
            vencedor = 1;
        } else {
            vencedor = 2;
        }

        String resultado = (vencedor == 0) ? "Empate"
                         : (vencedor == 1) ? "Jogador 1 venceu"
                         : "Jogador 2 venceu";

        System.out.println(resultado);

        scanner.close();
    }
}