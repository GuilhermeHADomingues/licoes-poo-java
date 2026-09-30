package Licao6;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Inserir Funcionario");
            System.out.println("2 - Exibir Funcionarios");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Numero do cracha: ");
                    int numeroCracha = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Setor: ");
                    String setor = sc.nextLine();

                    System.out.print("Funcao: ");
                    String funcao = sc.nextLine();

                    System.out.print("Funcionario Horista ou Mensalista? (H/M): ");
                    String tipo = sc.nextLine();

                    if (tipo.equalsIgnoreCase("H")) {
                        System.out.print("Quantidade de horas: ");
                        int qtdeHoras = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Valor da hora: ");
                        double valorHora = sc.nextDouble();
                        sc.nextLine();

                        funcionarios.add(new FuncionarioHorista(numeroCracha, nome, setor, funcao, qtdeHoras, valorHora));
                    } else {
                        System.out.print("Salario: ");
                        double salario = sc.nextDouble();
                        sc.nextLine();

                        funcionarios.add(new FuncionarioMensalista(numeroCracha, nome, setor, funcao, salario));
                    }

                    System.out.println("Funcionario cadastrado com sucesso!");
                    break;

                case 2:
                    if (funcionarios.isEmpty()) {
                        System.out.println("Nenhum funcionario cadastrado.");
                    } else {
                        for (Funcionario f : funcionarios) {
                            System.out.println(f.imprimir());
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }

        } while (opcao != 3);

        sc.close();
    }
}