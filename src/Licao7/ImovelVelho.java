package Licao7;

public class ImovelVelho extends Imovel{
    private double valorDesconto;

    public ImovelVelho() {

    }
    public ImovelVelho (int codigo, String endereco, double valor, double valorDesconto) {
        super(codigo, endereco, valor);
        this.valorDesconto = valorDesconto;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    public double calcularValorImovel(){
        return valor - valorDesconto;
    }

    @Override
    public String imprimir() {
        return "Codigo: " + codigo + "\n" +
                "Endereco: " + endereco + "\n" +
                "Valor: " + valor + "\n" +
                "Valor Desconto: " + valorDesconto + "\n" +
                "Valor do Imovel: " + calcularValorImovel() + "\n";
    }

}
