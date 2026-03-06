package conversordemoedas;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    ConversorMoeda conversor = new ConversorMoeda();

    public void iniciar() {

        int opcao = 0;

        while (opcao != 7) {

            System.out.println("\n===== CONVERSOR DE MOEDAS =====");
            System.out.println("1 - Real → Dólar");
            System.out.println("2 - Dólar → Real");
            System.out.println("3 - Real → Peso Argentino");
            System.out.println("4 - Peso Argentino → Real");
            System.out.println("5 - Real → Peso Chileno");
            System.out.println("6 - Peso Chileno → Real");
            System.out.println("7 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 7) {
                System.out.println("Encerrando...");
                break;
            }

            System.out.print("Digite o valor: ");
            double valor = scanner.nextDouble();

            double resultado = 0;

            switch (opcao) {

                case 1:
                    resultado = conversor.converter("BRL","USD",valor);
                    break;

                case 2:
                    resultado = conversor.converter("USD","BRL",valor);
                    break;

                case 3:
                    resultado = conversor.converter("BRL","ARS",valor);
                    break;

                case 4:
                    resultado = conversor.converter("ARS","BRL",valor);
                    break;

                case 5:
                    resultado = conversor.converter("BRL","CLP",valor);
                    break;

                case 6:
                    resultado = conversor.converter("CLP","BRL",valor);
                    break;
            }

            System.out.println("Valor convertido: " + resultado);
        }
    }
}
