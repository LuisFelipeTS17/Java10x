package NivelBásico.Condicoes;

import java.util.Scanner;

public class EstudosSwitchCases {
    public static void main(String[] args) {
        /*
        * SwitchCases: Que servem para gerar casos especificos
        * Objetivo: Pedir pro usuario escolher entre os ninjas
        * */

        //Pedir ao usuario
        Scanner scanner = new Scanner(System.in);

        //Mostrar opções ao usuario
        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");
        System.out.println("________________________________");

        //Pedir ao usuario escolher uma das opcoes
        System.out.print("Digite um numero: ");
        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("Você digitou o número: " + escolhaDoUsuario);

        //  Reacao a esocolher um personagem

        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("O usuario escolheu o Naruto Uzumaki");
                break;

            case 2:
                System.out.println("O usuario escolheu o Sasuke Uchiha");
                break;

            case 3:
                System.out.println("O usuario escolheu a Sakura Haruno");
                break;

            default:
                System.out.println("Escolha não permitida! Tente de novo");
        }



        //Fechar a caixa
        scanner.close();

    }
}
