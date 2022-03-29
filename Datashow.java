package atividade;

public class Datashow {
    public String marca;
    public String cor;
    public String resolucao;
    public String vol;
    
    public void Ligar(){
        System.out.println("On");
    }
    public void Dados(){
        System.out.println("Sua marca é : "+this.marca);
        System.out.println("Sua cor é: "+this.cor);
        System.out.println("Sua resolução é de: "+this.resolucao);
        System.out.println("Sua voltagem é de: "+this.vol);
    }
}
