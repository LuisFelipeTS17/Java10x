package NivelIntermediario.OverloadSobrecarga;

public class Uchiha extends Ninja {

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoes, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoes, rank);
    }

    // Sobreescrever o metodo da classe Ninja
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é: " + nome + " e essa é a minha habilidade Uchiha, estilo fogo " + "essas sao os" +
                " meus numeros de missoes: " + numeroDeMissoes + "Missoes");
    }

    public void ativarSharigan() {
        System.out.println(nome + "Ativou o Sharingan");
    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println( "Meu nome é: " + nome +"e essa é a Inteligencia de combate");
    }

    // Inteligencia de combate
    @Override
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

    public void metodoProvisorio() {
        System.out.println("Teste");
    }
}
