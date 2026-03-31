package Desafio_Feitos_Pelo_Fiasco;

public class Uchiha extends Ninja {
   String habilidadeEspecial;

   public void mostrarHabilidadeEspecial() {
       System.out.println("Habilidade Especial" + habilidadeEspecial);
   }

    public void mostrarInformacoes() {
        System.out.println("nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Nivel de Dificuldade:  " + nivelDeficuldade);
        System.out.println("Status de Missão: " + statusDaMissao);


        System.out.println("Habilidade Especial Uchiha: Ativar Sharingan");
    }
}
