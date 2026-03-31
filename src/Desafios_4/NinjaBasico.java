package Desafios_4;

public class NinjaBasico implements Ninja {
    String nome;
    int idade;
    String habilidade;

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Habilidade: " + this.habilidade);

    }

    @Override
    public void executarHabilidade() {
        System.out.println(  this.nome + "Atibou a habilidade especial");
    }

    public NinjaBasico(String nome, String habilidade, int idade) {
        this.nome = nome;
        this.habilidade = habilidade;
        this.idade = idade;
    }
}
