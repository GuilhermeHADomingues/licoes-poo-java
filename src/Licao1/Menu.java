package Licao1;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        int opcao;

        do {
            System.out.println("1 - Criar Pessoa");
            System.out.println("2 - Mostrar Pessoa");
            System.out.println("3 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite seu CPF:");
                    pessoa.setCPF(scanner.nextLine());

                    System.out.println("Digite seu Nome:");
                    pessoa.setNome(scanner.nextLine());

                    System.out.println("Sexo (M/F):");
                    pessoa.setSexo(scanner.nextLine().charAt(0));

                    System.out.println("Digite sua Idade:");
                    pessoa.setIdade(scanner.nextInt());
                    scanner.nextLine();
                    break;

                case 2:
                    System.out.println("CPF: " + pessoa.getCPF());
                    System.out.println("Nome: " + pessoa.getNome());
                    System.out.println("Sexo: " + pessoa.getSexo());
                    System.out.println("Idade: " + pessoa.getIdade());
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);

        scanner.close();
    }
}