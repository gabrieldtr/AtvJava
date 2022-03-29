package atividade;

public class MetMain {
    public static void main(String[] args) {
        Lampada L1 = new Lampada();
        
        L1.cor = "Azul";
        L1.marca = "Xiaomi";
        L1.pot = 15;
        L1.vol = 330;
        L1.Ligar();
        L1.Dados();
        
        Televisao T1 = new Televisao();
        
        T1.cor = "Preta";
        T1.marca = "LG";
        T1.pol = 32;
        T1.res = "1280x720";
        T1.Ligar();
        T1.Dados();
        
        Elevador E1 = new Elevador();
        
        E1.and = 10;
        E1.porta = "Branca";
        E1.painel = "Multifuncional";
        E1.tamanho = 200;
        E1.Subir();
        E1.Dados();
        
        Cadeira C1 = new Cadeira();
        
        C1.marca = "Mondial";
        C1.cor = "Preta e Azul";
        C1.tamanho = 2;
        C1.material = "Plástico";
        C1.Deitar();
        C1.Dados();
        
        Aluno A1 = new Aluno();
        
        A1.nome = "Gabriel";
        A1.idade = 63;
        A1.altura = 2.30;
        A1.cpf = "123.456.789-10";
        A1.Ler();
        A1.Dados();
        
        Datashow D1 = new Datashow();
        
        D1.marca = "LG";
        D1.cor = "Preto";
        D1.resolucao = "4K";
        D1.vol = "10";
        D1.Ligar();
        D1.Dados();
        
        Microondas M1 = new Microondas();
        
        M1.marca = "LG";
        M1.cor = "Preto";
        M1.pot = "30";
        M1.vol = "10";
        M1.Ligar();
        M1.Dados();
        
    }
}
