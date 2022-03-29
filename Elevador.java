package atividade;

public class Elevador {
    public int and;
    public String porta;
    public int tamanho;
    public String painel;
    
    public void Subir(){
        System.out.println("Subindo");
    }
    public void Dados(){
        System.out.println("Ele tem: "+this.and+" andares");
        System.out.println("Sua porta é: "+this.porta);
        System.out.println("Seu tamanho é de: "+this.tamanho);
        System.out.println("Seu painel é: "+this.painel);
    }
    
}
