package Licao3;

public class Funcionario {
    int Cracha;
    String Nome;
    char TipoVinculo;
    float ValorHora;
    float QtdeHora;
    float Salario;
    float ValorDesconto;

    public void setCracha(int Cracha){
        this.Cracha = Cracha;

    }

    public int getCracha(){
        return this.Cracha;
    }

    public void setNome(String Nome){
        this.Nome = Nome;
    }

    public String getNome(){
        return this.Nome;
    }
    public void setTipoVinculo(char TipoVinculo){
        this.TipoVinculo = TipoVinculo;
    }
    public char getTipoVinculo(){
        return this.TipoVinculo;
    }
    public void setValorHora(float ValorHora){
        this.ValorHora = ValorHora;
    }
    public float getValorHora(){
        return this.ValorHora;
    }
    public void setQtdeHora(float QtdeHora){
        this.QtdeHora = QtdeHora;
    }
    public float getQtdeHora(){
        return this.QtdeHora;
    }
    public void setSalario(float Salario){
        this.Salario = Salario;
    }
    public float getSalario(){
        return this.Salario;
    }
    public void setValorDesconto(float ValorDesconto){
        this.ValorDesconto = ValorDesconto;
    }
    public float calcularValorSalario(){
        if(TipoVinculo == 'H'){
            return ValorHora * QtdeHora - ValorDesconto;
        } else
            return Salario - ValorDesconto;
    }
    public String Imprimir(){
        return "Cracha: " + Cracha + "\n" +
                "Nome: " + Nome + "\n" +
                "Tipo Vinculo: " + TipoVinculo + "\n" +
                "Salario: " + Salario + "\n" +
                "Desconto: " + ValorDesconto + "\n" +
                "Valor a receber: " + calcularValorSalario();
    }
}
