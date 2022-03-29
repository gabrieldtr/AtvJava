package atividade;

public class Microondas {
    public String marca;
    public String cor;
    public String pot;
    public String vol;
    
    public void Ligar(){
        System.out.println("On");
    }
    public void Dados(){
        System.out.println("Sua marca é : "+this.marca);
        System.out.println("Sua cor é: "+this.cor);
        System.out.println("Sua potência é de: "+this.pot);
        System.out.println("Sua voltagem é de: "+this.vol);
    }
}
