package atividade;

public class Televisao {
    public String cor;
    public String marca;
    public int pol;
    public String res;
    
    public void Ligar(){
        System.out.println("On");
    }
    public void Dados(){
        System.out.println("Sua cor é: "+this.cor);
        System.out.println("Sua marca é: "+this.marca);
        System.out.println("Ela tem: "+this.pol+" polegadas");
        System.out.println("Sua resolução é: "+this.res);
    }
    
}
