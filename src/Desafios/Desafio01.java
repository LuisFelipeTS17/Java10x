package Desafios;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeNinja = "Naruto Uzumaki";
        int idade = 12;
        String missaoNinja = "Salvar cachorro do Hokage";
        char nivelmissao = 'A';
        String statusDaMissao = "Em andamento";

        String nomeNinja2 = "Naruto Uzumaki";
        int idade2 = 16;
        String missaoNinja2 = "Reconhecimento de Vila";
        char nivelmissao2 = 'D';
        String statusDaMissao2 = "Concluida";

        String nomeNinja3 = "Naruto Uzumaki";
        int idade3 = 16;
        String missaoNinja3 = "Curar feridos da guerra";
        char nivelmissao3 = 'D';
        String statusDaMissao3 = "Concluida";


        System.out.println("nome do ninja = " + nomeNinja);
        System.out.println("idade do ninja = " + idade + " anos");

        System.out.println("nivel da Missão = " + nivelmissao);
        System.out.println("Status da Missão = " + statusDaMissao);


        if (idade > 15 ) {
        if (nivelmissao  == 'C' || nivelmissao == 'D') {
            System.out.println("O ninja concluiu a missão");
        }else {
            System.out.println("O ninja não pode concluir a missão!");
        }
        }else {
            System.out.println("O ninja não pode concluir essa missão!");
        }


    }
}
