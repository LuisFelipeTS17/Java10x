package ReferenciaMemoriaEValorMemoriaTOSTRING;

public class Uchiha extends Ninja {
    public Uchiha() {
    }

    public Uchiha(String nome, String aleia, int idade) {
        super(nome, aleia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, NivelNinja rank) {
        super(nome, aldeia, idade, rank);
    }

    @Override
    public String toString() {
        return "Meu nome é:" + nome +
                " | Vila: " + aldeia +
                " | Idade: " + idade ;
    }
}
