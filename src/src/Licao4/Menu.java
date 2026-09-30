package Licao4;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();
        Cursos curso = new Cursos();
        int opcao;
        do {
            System.out.println("1 - Criar Curso");
            System.out.println("2 - Criar Aluno (Ra / Nome)");
            System.out.println("3 - Remover Aluno");
            System.out.println("4 - Mostrar Aluno");
            System.out.println("5   - Sair");
            opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o Codigo do Curso: ");
                    curso.setCodigo(scan.nextInt());
                    System.out.println("Digite o Nome do Curso: ");
                    curso.setNome(scan.next());
                    System.out.println("Digite a carga Horária do Curso: ");
                    curso.setCargaHoraria(scan.nextInt());
                    break;
                case 2:
                    System.out.println("Digite o Nome do Aluno: ");
                    aluno.setNome(scan.next());
                    System.out.println("Digite o Ra do Aluno: ");
                    aluno.setRa(scan.next());
                    curso.inserirAluno(aluno);
                    break;
                case 3:
                    System.out.println("Digite o  Ra que deseja receber");
                    String ra = scan.next();
                    curso.removerAluno(ra);
                    break;

                case 4:
                    for (Aluno a : curso.getAluno()) {
                        System.out.println(a.imprimir());
                    }
                    break;


                case 5:
                    System.out.println("Saindo do programa...");
                    break;

            }

        } while (opcao != 5);



    }
}
