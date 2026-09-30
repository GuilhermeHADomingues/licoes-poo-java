package Licao7;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Imovel> imoveis = new ArrayList<>();
        int opcao;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1 - Inserir imovel");
            System.out.println("2 - Exibir imoveis");
            System.out.println("3 - Sair");
            opcao = lerInt("Escolha uma opcao: ");

            switch (opcao) {
                case 1:
                    inserirImovel(imoveis);
                    break;
                case 2:
                    exibirImoveis(imoveis);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
            System.out.println();
        } while (opcao != 3);
    }

    private static void inserirImovel(ArrayList<Imovel> imoveis) {
        int tipo;
        do {
            tipo = lerInt("O imovel e novo (1) ou velho (2)? ");
            if (tipo != 1 && tipo != 2) {
                System.out.println("Digite 1 para novo ou 2 para velho.");
            }
        } while (tipo != 1 && tipo != 2);

        int codigo = lerInt("Codigo: ");
        System.out.print("Endereco: ");
        String endereco = sc.nextLine();
        double valor = lerDouble("Valor: ");

        if (tipo == 1) {
            double adicional = lerDouble("Valor adicional: ");
            imoveis.add(new ImovelNovo(codigo, endereco, valor, adicional));
        } else {
            double desconto = lerDouble("Valor do desconto: ");
            imoveis.add(new ImovelVelho(codigo, endereco, valor, desconto));
        }

        System.out.println("Imovel cadastrado com sucesso!");
    }

    private static void exibirImoveis(ArrayList<Imovel> imoveis) {
        if (imoveis.isEmpty()) {
            System.out.println("Nenhum imovel cadastrado.");
            return;
        }

        for (Imovel imovel : imoveis) {
            System.out.println(imovel.imprimir());
        }
    }

    private static int lerInt(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Valor invalido. Digite um numero inteiro.");
            }
        }
    }

    private static double lerDouble(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            try {
                return Double.parseDouble(sc.nextLine().trim().replace(",", "."));
            } catch (NumberFormatException e) {
                System.out.println("Valor invalido. Digite um numero (ex: 150000.50).");
            }
        }
    }
}