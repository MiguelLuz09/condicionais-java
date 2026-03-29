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

        titulos[0] = "Par ou Ímpar";
        enunciados[0] = "Leia um número inteiro e informe se ele é par ou ímpar. Obrigatório: use o operador ternário para exibir a mensagem.";

        titulos[1] = "Maior de Dois Números";
        enunciados[1] = "Leia dois números inteiros e exiba qual é o maior. Obrigatório: use o operador ternário para determinar e exibir o maior.";

        titulos[2] = "Aprovação Escolar";
        enunciados[2] = "Leia a média de um aluno (0 a 10) e exiba:\\n Aprovado se média >= 7\\n Recuperação se média >= 5 e < 7\\n Reprovado se média < 5";

        titulos[3] = "Classificação de Temperatura";
        enunciados[3] = "Leia a temperatura em graus Celsius e classifique:\n Abaixo de 15°C → Frio\n Entre 15°C e 25°C → Agradável\n Acima de 25°C → Quente\n Desafio: tente usar o ternário aninhado para classificar";

        titulos[4] = "Calculadora Simples com Switch";
        enunciados[4] = "Leia dois números e um operador (+, -, *, /) e realize a operação correspondente usando switch. Trate a divisão por zero.";

        titulos[5] = "Ano Bissexto";
        enunciados[5] = "Leia um ano e informe se ele é bissexto ou não. Um ano é bissexto se divisível por 4, exceto centenários, salvo os divisíveis por 400.";

        titulos[6] = "Triângulo Válido";
        enunciados[6] = "Leia três lados e verifique se formam um triângulo válido. Se sim, classifique como equilátero, isósceles ou escaleno.";

        titulos[7] = "IMC";
        enunciados[7] = "Leia o peso (kg) e a altura (m) de uma pessoa, calcule o IMC (peso / altura²) e classifique:\n IMC < 18.5 → Abaixo do peso\n 18.5 ≤ IMC < 25 → Peso normal\n 25 ≤ IMC < 30 → Sobrepeso\n IMC ≥ 30 → Obesidade\n Desafio: use o ternário para exibir se o IMC está dentro ou fora da faixa saudável.";

        titulos[8] = "Dia da Semana com Switch";
        enunciados[8] = "Leia um número de 1 a 7 e exiba o nome do dia da semana correspondente usando switch. Para qualquer outro número, exiba Dia inválido.";

        titulos[9] = "Positivo, Negativo ou Zero";
        enunciados[9] = "Leia um número e informe se é positivo, negativo ou zero. Obrigatório: use o operador ternário aninhado.";

        titulos[10] = "Ingresso de Cinema";
        enunciados[10] = "Uma sala de cinema cobra:\n Menores de 12 anos: R$ 10,00\n Entre 12 e 60 anos: R$ 20,00\n Acima de 60 anos: R$ 10,00 (meia)\n Leia a idade e exiba o valor do ingresso.";

        titulos[11] = "Nota por Conceito";
        enunciados[11] = "Leia uma nota (0-10) e exiba o conceito:\n 9 a 10 → A\n 7 a 8 → B\n 5 a 6 → C\n 0 a 4 → D";

        titulos[12] = "Estação do Ano com Switch";
        enunciados[12] = "Leia o número do mês (1-12) e exiba a estação do ano correspondente (considere o hemisfério sul).";

        titulos[13] = "Maior de Três Números";
        enunciados[13] = "Leia três números inteiros e exiba qual é o maior entre os três. Trate o caso de empate.";

        titulos[14] = "Verificador de Login";
        enunciados[14] = "Defina um usuário e senha fixos no código. Leia o usuário e a senha digitados e exiba Acesso Permitido ou Acesso Negado. Obrigatório: use o operador ternário para exibir a mensagem.";

        titulos[15] = "Múltiplo de 3 e 5";
        enunciados[15] = "Leia um número inteiro e informe:\n Se é múltiplo de 3 e de 5 simultaneamente\n Se é múltiplo apenas de 3\n Se é múltiplo apenas de 5\n Se não é múltiplo de nenhum\n Desafio: use o ternário onde for possível.";

        titulos[16] = "Desconto em Compra";
        enunciados[16] = "Uma loja dá desconto conforme o valor da compra:\n Acima de R$ 500 → 20% de desconto\n Entre R$ 200 e R$ 500 → 10% de desconto\n Abaixo de R$ 200 → sem desconto\n Leia o valor e exiba o valor final após o desconto.";

        titulos[17] = "Número Romano com Switch";
        enunciados[17] = "Leia um número de 1 a 10 e exiba seu equivalente em algarismo romano usando switch.";

        titulos[18] = "Velocidade e Multa";
        enunciados[18] = "Leia a velocidade de um veículo e o limite da via. Classifique:\n Dentro do limite → Sem multa\n Até 20% acima → Multa leve\n Entre 20% e 50% acima → Multa grave\n Acima de 50% → Multa gravíssima + suspensão";

        titulos[19] = "Jogo Pedra, Papel e Tesoura";
        enunciados[19] = "Leia a escolha de dois jogadores (pedra, papel ou tesoura)...";

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

                case 7:
                    char opcao = ' ';
                    int pAtual = 0;

                    do {
                        int itensPorPagina = 7;
                        int tExercicios = 20;
                        int tPaginas = (int) Math.ceil((double) tExercicios / itensPorPagina);

                        int inicio = pAtual * itensPorPagina;
                        int fim = Math.min(inicio + itensPorPagina, tExercicios);

                        for (int i = inicio; i < fim; i++) {
                            System.out.println(i + 1 + "-" + titulos[i]);
                        }

                        if (pAtual > 0)
                            System.out.println("A - Página Anterior");
                        if (pAtual < tPaginas - 1)
                            System.out.println("P - Próxima Página");

                        System.out.println("Digite o número do exercício para ver o enunciado");
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