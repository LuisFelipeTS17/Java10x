package ReferenciaMemoriaEValorMemoriaTOSTRING;

public class Ninja {
    String nome;
    String aldeia;
    int idade;
    NivelNinja rank;

    public Ninja() {
    }

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


