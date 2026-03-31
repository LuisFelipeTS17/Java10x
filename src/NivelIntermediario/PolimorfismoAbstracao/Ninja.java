package NivelIntermediario.PolimorfismoAbstracao;

public abstract class Ninja  implements EstrategiaDeBatalha{

    String nome;
    String aldeia;
    int idade;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //Metodos geral! Todos os ninjas vao ter
    public void habilidadeEspecial() {
        System.out.println("Meu nome é:" + nome + " e esse é meu ataque especial");
    }

    // Metodo abstrato - Obrigatorio em todas as classes
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println( "Meu nome é: " + nome +" essa é minha estrategia de combate");
    }
}
