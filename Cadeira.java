package atividade;

public class Cadeira {
    public String marca;
    public String cor;
    public int tamanho;
    public String material;
    
    public void Deitar(){
        System.out.println("Deitada");
    }
    public void Dados(){
        System.out.println("Sua marca é : "+this.marca);
        System.out.println("Sua cor é: "+this.cor);
        System.out.println("Seu tamanho é de: "+this.tamanho+" Metros");
        System.out.println("Seu matérial é: "+this.material);
    }
    
}