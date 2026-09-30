package Licao5;

import java.util.ArrayList;

public class Pessoa {

    private int codigo;
    private String nome;
    private ArrayList<Automovel> automoveis = new ArrayList<>();

    public Pessoa() {

    }

    public Pessoa(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public void inserirAutomovel(Automovel automoveis) {
        this.automoveis.add(automoveis);
    }

    public void removerAutomovel(int index) {
        automoveis.remove(index);
    }

    public ArrayList<Automovel> getAutomoveis() {
        return this.automoveis;
    }

    public String imprimir() {
        return "Escreva o codigo: " + this.codigo + "\nNome: " + this.nome;
    }

    public String imprimirCompleto() {
        String resultado = "Codigo: " + this.codigo + "\nNome: " + this.nome;
        resultado += "\nAutomoveis:";

        if (automoveis.isEmpty()) {
            resultado += " nenhum cadastrado.";
        } else {
            for (Automovel a : automoveis) {
                resultado += "\nMarca: " + a.getMarca() + " | Modelo: " + a.getModelo();
            }
        }

        return resultado;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}