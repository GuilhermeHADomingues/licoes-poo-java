package Licao7;

public class ImovelNovo extends Imovel {
    protected double valorAdicional;

    public ImovelNovo() {
    }

    public ImovelNovo(int codigo, String endereco, double valor, double valorAdicional) {
        super(codigo, endereco, valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double calcularValorImovel() {
        return valor + valorAdicional;
    }

    public String imprimir() {
        return "Codigo: " + codigo + "\n" +
                "Endereco: " + endereco + "\n" +
                "Valor Adicional: " + valorAdicional + "\n" +
                "Valor do Imovel: " + calcularValorImovel() + "\n";
    }
}