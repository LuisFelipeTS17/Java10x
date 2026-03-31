package NivelBásico.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        /*
        * Scanner = É um jeito de trazer o usuario para dentro da aplicação.
        * Objetivo: O usuario vai criar um ninja e vamor validar os dados
        *
        * */

        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva o nome do Ninja: ");
        String nomeDoNinja = sc.nextLine();

        System.out.println("Nome do Ninja é: " + nomeDoNinja);

        // Receber a idade do ninja
        System.out.print("Digite a idade do Ninja: ");
        int idade = sc.nextInt();

        System.out.print("A idade do ninja é: " + idade + " anos");

        if (idade >= 18) {
            System.out.println("Esse ninja já é maior de idade e pode sair em missões fora da vila ");
        } else {
            System.out.println(" Esse ninja é menor de idade ");
        }


        // Fecha o Scanner
        sc.close();
    }
}
