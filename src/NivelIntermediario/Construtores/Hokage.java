package NivelIntermediario.Construtores;

public  abstract class Hokage {
    String nome;
    boolean vivoOuMorto;
    int idade;
    String aldeia;
    int missoes;
    double saldoBancaria;
    double altura;


    public abstract void sabedoriaHokage();

    // Voce consegue criar automaticamente os construtores com intellijei com alt + insert
    public Hokage(String nome, double altura, double saldoBancaria, int missoes, String aldeia, int idade, boolean vivoOuMorto) {
        this.nome = nome;
        this.altura = altura;
        this.saldoBancaria = saldoBancaria;
        this.missoes = missoes;
        this.aldeia = aldeia;
        this.idade = idade;
        this.vivoOuMorto = vivoOuMorto;
    }




}
