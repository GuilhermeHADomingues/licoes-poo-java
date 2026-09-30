package Licao6;

public class FuncionarioMensalista extends Funcionario{
    private double salario;

    public  FuncionarioMensalista(){

    }
    public FuncionarioMensalista(int numeroCracha, String nome, String setor, String funcao, double salario){
        super(numeroCracha, nome, setor,funcao);
        this.salario = salario;

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public String imprimir(){
        return "Numero Cracha: " + numeroCracha + "\n" +
                "Nome: " + nome + "\n" +
                "Setor: " + setor + "\n" +
                "Funcao: " + funcao + "\n" +
                "Salario: " + salario + "\n";
    }
}