package atividade;

public class Lampada {
    public String cor;
    public String marca;
    public int pot;
    public int vol;
    
    public void Ligar(){
        System.out.println("On");
    }
    public void Dados(){
        System.out.println("Sua cor é: "+this.cor);
        System.out.println("Sua marca é: "+this.marca);
        System.out.println("Sua potência é: "+this.pot+"w");
        System.out.println("Sua voltagem é: "+this.vol+"v");
    }

    void Dados2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
