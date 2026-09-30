package Licao6;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FormaGeometrica[] formas = new FormaGeometrica[10];
        int quantidade = 0;
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Inserir e calcular área");
            System.out.println("2 - Mostrar todas as formas inseridas");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    if (quantidade >= formas.length) {
                        System.out.println("Array cheio! Não é possível inserir mais formas.");
                        break;
                    }

                    System.out.print("Tipo da forma (1 - Retângulo, 2 - Círculo): ");
                    int tipo = sc.nextInt();

                    if (tipo == 1) {
                        System.out.print("Largura: ");
                        double largura = sc.nextDouble();
                        System.out.print("Altura: ");
                        double altura = sc.nextDouble();

                        Retangulo r = new Retangulo(largura, altura);
                        formas[quantidade] = r;
                        quantidade++;
                        System.out.printf("Área do retângulo: %.2f%n", r.calcularArea());

                    } else if (tipo == 2) {
                        System.out.print("Raio: ");
                        double raio = sc.nextDouble();

                        Circulo c = new Circulo(raio);
                        formas[quantidade] = c;
                        quantidade++;
                        System.out.printf("Área do círculo: %.2f%n", c.calcularArea());

                    } else {
                        System.out.println("Tipo inválido!");
                    }
                    break;

                case 2:
                    if (quantidade == 0) {
                        System.out.println("Nenhuma forma inserida ainda.");
                    } else {
                        System.out.println("\n--- Formas inseridas ---");
                        for (int i = 0; i < quantidade; i++) {
                            System.out.printf("%d) %s | Área: %.2f%n",
                                    i + 1, formas[i], formas[i].calcularArea());
                        }
                    }
                    break;

                case 3:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);

        sc.close();
    }
}