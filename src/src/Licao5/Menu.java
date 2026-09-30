package Licao5;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n1 - Criar Pessoa");
            System.out.println("2 - Criar Automovel");
            System.out.println("3 - Transferir Automovel");
            System.out.println("4 - Mostrar Todas as Pessoas");
            System.out.println("5 - Mostrar Automovel da Pessoa");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o codigo da Pessoa: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine(); // limpa o \n

                    System.out.print("Digite o nome da Pessoa: ");
                    String nome = scanner.nextLine();

                    Pessoa pessoa = new Pessoa(codigo, nome);
                    pessoas.add(pessoa);

                    System.out.println("Pessoa criada com sucesso!");
                    break;

                case 2:
                    if (pessoas.isEmpty()) {
                        System.out.println("Nenhuma pessoa cadastrada. Crie uma pessoa primeiro.");
                        break;
                    }

                    System.out.print("Digite a marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Digite o modelo: ");
                    String modelo = scanner.nextLine();

                    Automovel automovel = new Automovel(marca, modelo);

                    System.out.println("Escolha a pessoa dona do automovel:");
                    for (int i = 0; i < pessoas.size(); i++) {
                        System.out.println(i + " - " + pessoas.get(i).getNome());
                    }
                    System.out.print("Digite o indice: ");
                    int indiceDono = scanner.nextInt();
                    scanner.nextLine();

                    if (indiceDono < 0 || indiceDono >= pessoas.size()) {
                        System.out.println("Indice invalido.");
                        break;
                    }

                    Pessoa dono = pessoas.get(indiceDono);
                    dono.inserirAutomovel(automovel);
                    System.out.println("Automovel criado e vinculado a " + dono.getNome() + "!");
                    break;

                case 3:
                    if (pessoas.isEmpty()) {
                        System.out.println("E preciso ter pessoas cadastradas.");
                        break;
                    }

                    System.out.println("Escolha a pessoa de ORIGEM:");
                    for (int i = 0; i < pessoas.size(); i++) {
                        System.out.println(i + " - " + pessoas.get(i).getNome());
                    }
                    System.out.print("Digite o indice: ");
                    int indiceOrigem = scanner.nextInt();
                    scanner.nextLine();

                    if (indiceOrigem < 0 || indiceOrigem >= pessoas.size()) {
                        System.out.println("Indice invalido.");
                        break;
                    }

                    Pessoa origem = pessoas.get(indiceOrigem);
                    ArrayList<Automovel> automoveisOrigem = origem.getAutomoveis();

                    if (automoveisOrigem.isEmpty()) {
                        System.out.println("Essa pessoa nao possui automoveis para transferir.");
                        break;
                    }

                    System.out.println("Automoveis de " + origem.getNome() + ":");
                    for (int i = 0; i < automoveisOrigem.size(); i++) {
                        Automovel a = automoveisOrigem.get(i);
                        System.out.println(i + " - " + a.getMarca() + " | " + a.getModelo());
                    }
                    System.out.print("Escolha o indice do automovel a transferir: ");
                    int indiceAuto = scanner.nextInt();
                    scanner.nextLine();

                    if (indiceAuto < 0 || indiceAuto >= automoveisOrigem.size()) {
                        System.out.println("Indice invalido.");
                        break;
                    }

                    System.out.println("Escolha a pessoa de DESTINO:");
                    for (int i = 0; i < pessoas.size(); i++) {
                        System.out.println(i + " - " + pessoas.get(i).getNome());
                    }
                    System.out.print("Digite o indice: ");
                    int indiceDestino = scanner.nextInt();
                    scanner.nextLine();

                    if (indiceDestino < 0 || indiceDestino >= pessoas.size()) {
                        System.out.println("Indice invalido.");
                        break;
                    }

                    Pessoa destino = pessoas.get(indiceDestino);

                    if (destino == origem) {
                        System.out.println("A pessoa de destino nao pode ser a mesma de origem.");
                        break;
                    }

                    Automovel automovelTransferido = automoveisOrigem.get(indiceAuto);
                    origem.removerAutomovel(indiceAuto);
                    destino.inserirAutomovel(automovelTransferido);

                    System.out.println("Automovel transferido de " + origem.getNome() + " para " + destino.getNome() + "!");
                    break;

                case 4:
                    if (pessoas.isEmpty()) {
                        System.out.println("Nenhuma pessoa cadastrada.");
                        break;
                    }
                    for (Pessoa p : pessoas) {
                        System.out.println("----------------------------");
                        System.out.println(p.imprimirCompleto());
                    }
                    break;

                case 5:
                    if (pessoas.isEmpty()) {
                        System.out.println("Nenhuma pessoa cadastrada.");
                        break;
                    }

                    System.out.println("Escolha a pessoa:");
                    for (int i = 0; i < pessoas.size(); i++) {
                        System.out.println(i + " - " + pessoas.get(i).getNome());
                    }
                    System.out.print("Digite o indice: ");
                    int indicePessoa = scanner.nextInt();
                    scanner.nextLine();

                    if (indicePessoa < 0 || indicePessoa >= pessoas.size()) {
                        System.out.println("Indice invalido.");
                        break;
                    }

                    Pessoa pessoaEscolhida = pessoas.get(indicePessoa);
                    ArrayList<Automovel> automoveisDaPessoa = pessoaEscolhida.getAutomoveis();

                    System.out.println("Automoveis de " + pessoaEscolhida.getNome() + ":");
                    if (automoveisDaPessoa.isEmpty()) {
                        System.out.println("Nenhum automovel cadastrado.");
                    } else {
                        for (Automovel a : automoveisDaPessoa) {
                            System.out.println(a.getMarca() + " | " + a.getModelo());
                        }
                    }
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }

        } while (opcao != 6);

        scanner.close();
    }
}