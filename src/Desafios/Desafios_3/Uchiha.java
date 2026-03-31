package Desafios.Desafios_3;

public class Uchiha extends Ninja{
    public String habilidadeEspecial() {
      return "Você tem um sharigan";
    }

  public void mostraHabilidade() {
      System.out.println("Você ativou o sharigan");
  }

  public void mostrarInformacoes() {
        System.out.println("Nome: "+ nome);
        System.out.println("Nivel da dificuldade: "+ nivelDificuldade);
        System.out.println("Status da Missão: " + statusMissao);
        System.out.println("Idade: "+idade);
      System.out.println("Sua Habilidade especial: " + habilidadeEspecial());
  }
}
