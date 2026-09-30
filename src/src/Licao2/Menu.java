package Licao2;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();
        int opcao;

        do {
            System.out.println("1 - CRIAR ALUNO");
            System.out.println("2 - MOSTRAR ALUNO");
            System.out.println("3 - SAIR");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    scanner.nextLine(); // limpa o "resto" da linha antes de ler texto
                    System.out.println("Digite o RA:");
                    aluno.setRa(scanner.nextLine());

                    System.out.println("Digite o Nome:");
                    aluno.setNome(scanner.nextLine());

                    System.out.println("Digite AC1:");
                    aluno.setAC1(scanner.nextFloat());

                    System.out.println("Digite AC2:");
                    aluno.setAC2(scanner.nextFloat());

                    System.out.println("Digite AG:");
                    aluno.setAG(scanner.nextFloat());

                    System.out.println("Digite AF:");
                    aluno.setAF(scanner.nextFloat());
                    break;

                case 2:
                    System.out.println(aluno.imprimir());
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