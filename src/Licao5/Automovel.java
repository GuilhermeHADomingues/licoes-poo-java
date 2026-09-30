package Licao5;

public class Automovel{
    private String marca;
    private String modelo;
    
    public Automovel(){

    }
    public Automovel(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;

    }
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String imprimir(){
        return "A marca e modelo do veículo é: " + this.marca + "\nModelo" + this.modelo;
    }
    
}