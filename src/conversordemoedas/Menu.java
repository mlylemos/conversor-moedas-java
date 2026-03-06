package conversordemoedas;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    ConversorMoeda conversor = new ConversorMoeda();

    public void iniciar() {
        int opcao = 0;

        while (opcao != 9) {
            System.out.println("\n===== CONVERSOR DE MOEDAS =====");
            System.out.println("1  - Real (BRL) → Dólar (USD)");
            System.out.println("2  - Dólar (USD) → Real (BRL)");
            System.out.println("3  - Real (BRL) → Peso Argentino (ARS)");
            System.out.println("4  - Peso Argentino (ARS) → Real (BRL)");
            System.out.println("5  - Real (BRL) → Peso Chileno (CLP)");
            System.out.println("6  - Peso Chileno (CLP) → Real (BRL)");
            System.out.println("7  - Real (BRL) → Boliviano (BOB)");
            System.out.println("8  - Real (BRL) → Peso Colombiano (COP)");
            System.out.println("9  - Sair");
            System.out.print("Escolha uma opção: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Opção inválida! Digite um número entre 1 e 9.");
                scanner.next();
                continue;
            }

            opcao = scanner.nextInt();

            if (opcao == 9) {
                System.out.println("Encerrando o conversor. Até mais!");
                break;
            }

            if (opcao < 1 || opcao > 8) {
                System.out.println("Opção inválida! Escolha entre 1 e 9.");
                continue;
            }

            System.out.print("Digite o valor a converter: ");

            if (!scanner.hasNextDouble()) {
                System.out.println("Valor inválido! Digite um número.");
                scanner.next();
                continue;
            }

            double valor = scanner.nextDouble();

            String moedaOrigem = "";
            String moedaDestino = "";

            switch (opcao) {
                case 1: moedaOrigem = "BRL"; moedaDestino = "USD"; break;
                case 2: moedaOrigem = "USD"; moedaDestino = "BRL"; break;
                case 3: moedaOrigem = "BRL"; moedaDestino = "ARS"; break;
                case 4: moedaOrigem = "ARS"; moedaDestino = "BRL"; break;
                case 5: moedaOrigem = "BRL"; moedaDestino = "CLP"; break;
                case 6: moedaOrigem = "CLP"; moedaDestino = "BRL"; break;
                case 7: moedaOrigem = "BRL"; moedaDestino = "BOB"; break;
                case 8: moedaOrigem = "BRL"; moedaDestino = "COP"; break;
            }

            double resultado = conversor.converter(moedaOrigem, moedaDestino, valor);

            if (resultado > 0) {
                System.out.printf("%.2f %s = %.2f %s%n", valor, moedaOrigem, resultado, moedaDestino);
            }
        }

        scanner.close();
    }
}
