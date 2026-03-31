package Desafios.Desafios_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====Bem-vindo ao Menu de Ninjas=======");
        System.out.println("1.Exibir informações");
        System.out.println("2.Todos os ninjas");
        System.out.println("3.Adicionar novos Ninjas");
        System.out.println("4.Atualizar as habilidades especiais");

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 18;
        Sasuke.nivelDificuldade = "Fácil";
        Sasuke.missao = "Salvar gato do Hokage";
        Sasuke.statusMissao = "Em andamento";

        Sasuke.mostrarInformacoes();
        String habilidade=  Sasuke.habilidadeEspecial();
        System.out.println(habilidade);
        Sasuke.mostraHabilidade();

    }
}
