package ReferenciaMemoriaEValorMemoriaTOSTRING;

public class Ninja {
    String nome;
    String aldeia;
    int idade;
    NivelNinja rank;
    final double altura = 2.10;

    public Ninja() {
    }

    //TODO NINJA VAI FAZER OBRIHATORIAMENTE
    final void tacarKunai() {
        System.out.println("Eu sou um método da classe mãe!");
    }

    //Metodo existente: Primeiro metodo
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public Ninja(String nome, String aldeia, int idade, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.rank = rank;
    }
}


