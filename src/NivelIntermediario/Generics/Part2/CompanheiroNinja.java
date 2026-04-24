package NivelIntermediario.Generics.Part2;

public class CompanheiroNinja {
    private String nomeDoAnimal;

    public CompanheiroNinja(String nomeDoAnimal) {
        this.nomeDoAnimal = nomeDoAnimal;
    }

    public void setNomeDoAnimal(String nomeDoAnimal) {
        this.nomeDoAnimal = nomeDoAnimal;
    }

    @Override
    public String toString() {
        return "Esse é meu companheiro Ninja: " + nomeDoAnimal ;
    }
}
