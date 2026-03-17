import java.util.Scanner;

public class Login {
    public static void main (String[] args){
        Scanner scanner =  new Scanner(System.in);
        String usuario = "r";
        int senha = 1;

        System.out.println("informe o seu usuario: ");
        String user = scanner.nextLine();

        System.out.println("informe sua senha: ");
        int password = scanner.nextInt();


        String login = (usuario == user && senha == password )? "Acesso Negado" : "Acesso Concedido";

        System.out.println(login);

        scanner.close();

    }
}
