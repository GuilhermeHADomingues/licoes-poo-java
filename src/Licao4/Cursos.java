package Licao4;

import java.util.ArrayList;

public class Cursos {
    private int codigo;
    private String nome;
    private int CargaHoraria;
    private ArrayList<Aluno> aluno = new ArrayList<>();

    public Cursos() {

    }

    public Cursos(int codigo, String nome, int CargaHoraria){
        this.codigo = codigo;
        this.nome = nome;
        this.CargaHoraria = CargaHoraria;

    }

    public void inserirAluno(Aluno aluno){
        this.aluno.add(aluno);
    }

    public void removerAluno(String ra) {
        for (int i = 0; i < aluno.size(); i++) {
            if (aluno.get(i).getRa().equals(ra)) {
                aluno.remove(i);
                System.out.println("Aluno removido com sucesso!");
                return;
            }
        }

        System.out.println("Aluno não encontrado!");
    }
    public String imprimir() {
        return "Nome do Curso"+ this.nome + "\nCodigo" + this.codigo + "\nCargaHoraria" + this.CargaHoraria;
    }
     public String imprimirCompleto(){
        return "Nome do Curso"+ this.nome + "\nCodigo" + this.codigo + "\nCargaHoraria" + this.CargaHoraria + "\nAluno" + this.aluno;
     }
     public void setCodigo(int Codigo) {
        this.codigo = Codigo;

     }
     public int getCodigo(){
        return this.codigo;
     }
     public void setNome(String nome){
        this.nome = nome;
     }
     public String getNome(){
        return this.nome;
     }
    public void setCargaHoraria(int CargaHoraria){
        this.CargaHoraria = CargaHoraria;

    }
    public int getCargaHoraria(){
        return this.CargaHoraria;
    }
    public void setAluno(ArrayList<Aluno> aluno){
        this.aluno = aluno;
    }
    public ArrayList<Aluno> getAluno(){
        return this.aluno;
    }
}
