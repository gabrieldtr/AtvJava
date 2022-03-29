package atividade;

public class Aluno {
    public String nome;
    public int idade;
    public double altura;
    public String cpf;
    
    public void Ler(){
        System.out.println("Lendo");
    }
    public void Dados(){
        System.out.println("Seu nome é : "+this.nome);
        System.out.println("Sua idade é: "+this.idade);
        System.out.println("Sua altura é de: "+this.altura+" Metros");
        System.out.println("Seu cpf é: "+this.cpf);
    }
}
