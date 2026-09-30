package Licao3;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        boolean funcionarioCriado = false;
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Criar Funcionario");
            System.out.println("2 - Mostrar Folha de Pagamento");
            System.out.println("3 - Alterar remuneracao");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar o buffer depois de ler um int

            switch (opcao) {
                case 1:
                    System.out.print("Cracha: ");
                    funcionario.setCracha(sc.nextInt());
                    sc.nextLine();

                    System.out.print("Nome: ");
                    funcionario.setNome(sc.nextLine());

                    System.out.print("Tipo de Vinculo (H = Horista / M = Mensalista): ");
                    char tipo = sc.nextLine().charAt(0);
                    funcionario.setTipoVinculo(tipo);

                    if (tipo == 'H') {
                        System.out.print("Valor da Hora: ");
                        funcionario.setValorHora(sc.nextFloat());

                        System.out.print("Quantidade de Horas: ");
                        funcionario.setQtdeHora(sc.nextFloat());
                    } else {
                        System.out.print("Salario: ");
                        funcionario.setSalario(sc.nextFloat());
                    }

                    System.out.print("Valor do Desconto: ");
                    funcionario.setValorDesconto(sc.nextFloat());

                    funcionarioCriado = true;
                    System.out.println("Funcionario criado com sucesso!");
                    break;

                case 2:
                    if (funcionarioCriado) {
                        System.out.println(funcionario.Imprimir());
                    } else {
                        System.out.println("Nenhum funcionario cadastrado ainda!");
                    }
                    break;

                case 3:
                    if (funcionarioCriado) {
                        if (funcionario.getTipoVinculo() == 'H') {
                            System.out.print("Novo Valor da Hora: ");
                            funcionario.setValorHora(sc.nextFloat());

                            System.out.print("Nova Quantidade de Horas: ");
                            funcionario.setQtdeHora(sc.nextFloat());
                        } else {
                            System.out.print("Novo Salario: ");
                            funcionario.setSalario(sc.nextFloat());
                        }
                        System.out.println("Remuneracao alterada com sucesso!");
                    } else {
                        System.out.println("Nenhum funcionario cadastrado ainda!");
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }

        } while (opcao != 4);

        sc.close();
    }
}