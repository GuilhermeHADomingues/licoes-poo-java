package Licao7;

public abstract class Imovel {
    protected int codigo;
    protected String endereco;
    protected double valor;

    public Imovel() {
    }

    public Imovel(int codigo, String endereco, double valor) {
        this.codigo = codigo;
        this.endereco = endereco;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public abstract double calcularValorImovel();

    public abstract String imprimir();
}