package NivelIntermediario.OverloadSobrecarga;

public abstract class Ninja  implements EstrategiaDeBatalha {

    //TODO: Incluir novos 2 atributos: numeroDeMissoesCOncluidas Rank
    //TODO: Rank: Gennin, Chunnin, Jounnin, Hokage

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoes;
    NivelNinja rank;

    public Ninja() {
    }

    //Metodo Existente: Primeiro metodo
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // TODO: SOBRECARREGAR O CONSTRUTOR CHAMANDO OS NOVOS ATRIBUTOS
    //Sobrecarga de metodos voce nao precisa redeclarar o construtor so os novos atributos
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoes, NivelNinja rank) {
        this(nome, aldeia, idade); // declaramos todos de uma vez sem a necessidade de repeticao
        this.numeroDeMissoes = numeroDeMissoes;
        this.rank = rank;
    }

    //Metodos geral! Todos os ninjas vao ter
    public void habilidadeEspecial() {
        System.out.println("Meu nome é:" + nome + " e esse é meu ataque especial, estilo Uchiha");
    }

    // Sobescrevendo o metood dde interface
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println( "Meu nome é: " + nome +" essa é minha estrategia de combate");
    }


    //Inteligencia dde combate - Metodo paddrao
    public void inteligenciaDeCombate() {
        System.out.println( "Meu nome é: " + nome +"Inteligencia de combate");
    }

    // INTELIGENCIA E COMBATE
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150){
            System.out.println("Seu QI é " + qi + " e você é um genio");
        }else if (qi >= 130) {
            System.out.println("Seu QI é" + " você é um ninja promissor!");
        } else {
            System.out.println("Seu QI é " + qi + "e você precisa treinar mais suas estrategias");
        }

        System.out.println( "Meu nome é: " + nome +" Inteligencia de combate: " + qi);
    }


}
