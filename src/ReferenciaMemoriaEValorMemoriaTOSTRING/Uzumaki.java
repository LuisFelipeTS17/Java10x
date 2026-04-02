package ReferenciaMemoriaEValorMemoriaTOSTRING;

public class Uzumaki extends Ninja {
    public Uzumaki() {
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public void modoBiju() {
        System.out.println("Ativou o modo Kurama|!");
    }

    public Uzumaki(String nome, String aldeia, int idade, NivelNinja rank) {
        super(nome, aldeia, idade, rank);
    }

    @Override
    public String toString() {
        return "Meu nome é:" + nome +
                " | Vila: " + aldeia +
                " | Idade: " + idade ;
    }
}
