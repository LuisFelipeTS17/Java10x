package Desafios_4;

public class NinjaAvancado implements Ninja {
    String nome;
    int idade;
    String habilidade;
    String especialidade;

    public NinjaAvancado(String habilidade, int idade, String nome, String especialidade) {
        this.habilidade = habilidade;
        this.idade = idade;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Habilidade: " + this.habilidade);
        System.out.println("Especialiade: " + this.especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println(  this.nome + "Ativou a habilidade especial");
    }
}
