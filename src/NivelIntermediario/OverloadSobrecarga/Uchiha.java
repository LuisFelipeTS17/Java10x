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
}
