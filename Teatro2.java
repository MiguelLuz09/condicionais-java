import java.util.Scanner;

public class Teatro2 {
    static int c_livre = 0;
    static int c_Ocupado = 0;
    static int c_Reservada = 0;

    static void calculadora(char[][] sala) {
        c_livre = c_Reservada = c_Ocupado = 0;
        for (int q = 0; q < 12; q++) {
            for (int q2 = 0; q2 < 12; q2++) {
                if (sala[q][q2] == ' ') {
                    c_livre++;
                } else if (sala[q][q2] == 'R') {
                    c_Reservada++;
                } else if (sala[q][q2] == 'X') {
                    c_Ocupado++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double ingresso = 120;
        double meioIngresso = 60;

        char[][] sala_disney = new char[12][12];
        char[][] sala_pixar = new char[12][12];
        char[][] sala_marvel = new char[12][12];

        char[][] sala_atual = sala_disney;
        char[][][] todas_salas = { sala_disney, sala_pixar, sala_marvel };

        for (int s = 0; s < 3; s++) {
            for (int l = 0; l < 12; l++) {
                for (int c = 0; c < 12; c++) {
                    todas_salas[s][l][c] = ' ';
                }
            }
        }

        int leia = 0;

        String[] titulos = new String[20];
        String[] enunciados = new String[20];

        // (seus titulos e enunciados continuam EXATAMENTE iguais)

        do {
            System.out.println("Informe a opição desejada: ");
            System.out.println("1 - Ver mapa do teatro");
            System.out.println("2 - Escolher sala do teatro");
            System.out.println("3 - Reserva Cadeira");
            System.out.println("4 - Comprar Cadeira");
            System.out.println("5 - Cancelar Reserva");
            System.out.println("6 - Ver Relatório Financeiro");
            System.out.println("7 - Ver os exercícios");
            System.out.println("0 - fechar programa");

            leia = ler.nextInt();

            switch (leia) {

                case 1:

                    // Números alinhados
                    System.out.print("   "); // espaço para alinhar com as letras
                    for (int n = 0; n < 12; n++) {
                        if (n + 1 < 10)
                            System.out.print(" " + (n + 1) + "  ");
                        else
                            System.out.print((n + 1) + "  ");
                    }

                    for (int l = 0; l < 12; l++) {
                        char letrinha = (char) ('A' + l);
                        System.out.print("\n" + letrinha + "  ");

                        for (int c = 0; c < 12; c++) {
                            if (sala_atual[l][c] == ' ')
                                System.out.print("[ ] ");
                            else if (sala_atual[l][c] == 'R')
                                System.out.print("[R] ");
                            else
                                System.out.print("[X] ");
                        }
                    }

                    System.out.println();
                    break;

                case 2:
                    System.out.println("Escolha uma sala de sua preferência: ");
                    System.out.println("1-Sala Pixar");
                    System.out.println("2-Sala Disney");
                    System.out.println("3-Sala Marvel");
                    int escolha = ler.nextInt();
                    if (escolha < 1 || escolha > 3) {
                        System.out.println("Sala não existente!!");
                    } else {
                        sala_atual = (escolha == 1) ? sala_pixar : (escolha == 2) ? sala_disney : sala_marvel;
                    }
                    break;

                case 3:
                    System.out.println("Digite a Linha desejada [A-L]: ");
                    char linha = ler.next().charAt(0);
                    linha = Character.toUpperCase(linha);
                    System.out.println("Digite a Coluna desejada [1-12]: ");
                    int coluna = ler.nextInt();
                    int linhaNumero = linha - 'A';
                    int colunaNumero = coluna - 1;
                    if (sala_atual[linhaNumero][colunaNumero] == ' ') {
                        sala_atual[linhaNumero][colunaNumero] = 'R';
                        System.out.println("Reserva Feita!");
                    } else if (sala_atual[linhaNumero][colunaNumero] == 'X') {
                        System.out.println("Não é possível reservar essa cadeira!");
                    } else {
                        System.out.println("Lugar já reservado!");
                    }
                    break;

                case 4:
                    System.out.println("Digite a Linha desejada [A-L]: ");
                    char linha2 = ler.next().charAt(0);
                    linha2 = Character.toUpperCase(linha2);
                    System.out.println("Digite a Coluna desejada [1-12]: ");
                    int coluna2 = ler.nextInt();
                    int linhaNumero2 = linha2 - 'A';
                    int colunaNumero2 = coluna2 - 1;
                    if (sala_atual[linhaNumero2][colunaNumero2] == ' ') {
                        sala_atual[linhaNumero2][colunaNumero2] = 'X';
                        System.out.println("Cadeira Comprada!");
                    } else if (sala_atual[linhaNumero2][colunaNumero2] == 'X') {
                        System.out.println("Cadeira já Ocupada!");
                    } else {
                        sala_atual[linhaNumero2][colunaNumero2] = 'X';
                        System.out.println("Pagamento restante realizado!");
                    }
                    break;

                case 5:
                    System.out.println("Digite a Linha desejada [A-L]: ");
                    char linha3 = ler.next().charAt(0);
                    linha3 = Character.toUpperCase(linha3);
                    System.out.println("Digite a Coluna desejada [1-12]: ");
                    int coluna3 = ler.nextInt();
                    int linhaNumero3 = linha3 - 'A';
                    int colunaNumero3 = coluna3 - 1;
                    if (sala_atual[linhaNumero3][colunaNumero3] == 'R') {
                        sala_atual[linhaNumero3][colunaNumero3] = ' ';
                        System.out.println("Cancelamento Concluído!");
                    } else if (sala_atual[linhaNumero3][colunaNumero3] == 'X') {
                        System.out.println("Não é possível cancelar, pois esta cadeira já esta comprada!");
                    } else {
                        System.out.println("Cadeira Vazia!");
                    }
                    break;

                case 6:
                    calculadora(sala_atual);
                    System.out.println("Total de cadeiras livres " + c_livre);
                    System.out.println("Total de cadeiras reservadas " + c_Reservada);
                    System.out.println("Total de cadeiras ocupadas " + c_Ocupado);
                    System.out.println("Total arrecadado (somente ingressos inteiros efetivamente pagos) "
                            + (c_Ocupado * ingresso));
                    System.out.println("Total em reservas (somente meios ingressos pagos em cadeiras reservadas) "
                            + (c_Reservada * meioIngresso));
                    System.out.println("Receita potencial se todas as reservas forem confirmadas "
                            + ((c_Ocupado * ingresso) + (c_Reservada * ingresso)));
                    System.out.println("Receita potencial máxima se todas as cadeiras livres forem vendidas"
                            + ((c_livre + c_Reservada + c_Ocupado) * ingresso));
                    break;

                case 7:
                    char opcao = ' ';
                    int pAtual = 0;
                    do {
                        int itensPorPagina = 7;
                        int tExercicios = 20;
                        int tPaginas = (int) Math.ceil((double) tExercicios / itensPorPagina);
                        int inicio = pAtual * itensPorPagina;
                        int fim = Math.min(inicio + itensPorPagina, tExercicios);
                        System.out.println("\n=== LISTA DE EXERCÍCIOS ===");
                        for (int i = inicio; i < fim; i++) {
                            System.out.println((i + 1) + " - " + titulos[i]);
                        }
                        if (pAtual > 0) {
                            System.out.println("A - Página Anterior");
                        }
                        if (pAtual < tPaginas - 1) {
                            System.out.println("P - Próxima Página");
                        }
                        System.out.println("Digite o número do exercício");
                        System.out.println("V - Voltar");
                        String entrada = ler.next();
                        opcao = entrada.toUpperCase().charAt(0);
                        if (Character.isDigit(entrada.charAt(0))) {
                            int escolhaEx = Integer.parseInt(entrada) - 1;
                            if (escolhaEx >= 0 && escolhaEx < tExercicios) {
                                System.out.println("\n=== " + titulos[escolhaEx] + " ===");
                                System.out.println(enunciados[escolhaEx]);
                                System.out.println("\nPressione qualquer tecla para voltar...");
                                ler.next();
                            } else {
                                System.out.println("Exercício inválido!");
                            }
                        } else {
                            if (opcao == 'P' && pAtual < tPaginas - 1) {
                                pAtual++;
                            } else if (opcao == 'A' && pAtual > 0) {
                                pAtual--;
                            }
                        }
                    } while (opcao != 'V');
                    break;

            }

        } while (leia != 0);

    }

}
