package Licao2;

public class Aluno {
    String Ra;
    String Nome;
    float AC1;
    float AC2;
    float AG;
    float AF;

    public void setRa(String Ra){
        this.Ra = Ra;
    }
    public String getRa(){
        return this.Ra;
    }

    public void setNome(String Nome){
        this.Nome = Nome;
    }

    public String getNome(){
        return this.Nome;

    }

    public void setAC1(float AC1){
        this.AC1 = AC1;
    }

    public float getAC1(){
        return this.AC1;
    }

    public void setAC2(float AC2){
        this.AC2 = AC2;
    }
    public float getAC2(){
        return this.AC2;
    }

    public void setAG(float AG){
        this.AG = AG;
    }
    public float getAG(){
        return this.AG;
    }
    public void setAF(float AF){
        this.AF = AF;
    }

    public float getAF(){
        return this.AF;
    }
    public float calcularMedia(){
        return (AC1 * 0.15f) + (AC2 * 0.30f) + (AG * 0.10f) + (AF * 0.45f);
    }
    public String verificarAprovacao(){
        if (calcularMedia() >= 5)
            return "Aprovado";
        else
            return "Reprovado";

    }

    public String imprimir(){
        return "RA: " + Ra + "\n" +
                "Nome: " + Nome + "\n" +
                "AC1: " + AC1 + "\n" +
                "AC2: " + AC2 + "\n" +
                "AG: " + AG + "\n" +
                "AF: " + AF + "\n" +
                "Média: " + calcularMedia() + "\n" +
                "Situação: " + verificarAprovacao();
    }
}
