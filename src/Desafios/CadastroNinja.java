package Desafios;

import java.util.Scanner;

public class CadastroNinja {
    public static void main(String[] args) {
        // cadastrar os ninjas em um array e depois mostrar opções com switch cases

        // Entrada de dados
        Scanner scanner = new Scanner(System.in);


        // Fazer o array;
        int NUMERO_MAX = 10;
        String[] ninjas = new String[NUMERO_MAX];

        // Contador de opções
        int ninjascadastrados = 0;
        int opcao =0;

        while (opcao != 4) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Deletar um ninja");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    if (ninjascadastrados < NUMERO_MAX) {
                        System.out.println("Digite o nome do ninja: ");
                        String nomeNinja = scanner.nextLine();
                        ninjas[ninjascadastrados] = nomeNinja;

                        //Somando mais um ninja na minha lista
                        ninjascadastrados++;
                        System.out.println("Ninja cadastrado com sucesso!");

                    } else {
                        System.out.println("A lista ta cheia!Impossivel cadastrar um novo ninja");
                    }
                    break;
                case 2:
                    if (ninjascadastrados == 0) {
                        System.out.println("Nenhum ninja encontrado!");
                    }else {
                        System.out.println("========Lista de ninjas cadastrados=========");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                        break;
                    }
                case 3:
                        if (ninjascadastrados == 0) {
                            System.out.println("Nenhum ninja encontrado!");
                        }else {
                            // mostrar Lista
                            System.out.println("==== Ninjas Cadastrados =====");
                            for (int i = 0; i < ninjascadastrados; i++) {
                                System.out.println((i + 1 ) + "." + ninjas[i]);
                            }

                            // Pede para deletar
                            System.out.println("Digite o número do ninja que deseja deletar: ");
                            int indice = scanner.nextInt();
                            scanner.nextLine();

                            //Valida
                            if ( indice < 1 || indice > ninjascadastrados) {
                                System.out.println("Número invalido!");
                            }else {
                                int posicao = indice -1;
                                String ninjaRemovido = ninjas[posicao];

                                ninjas[posicao] = ninjas[ninjascadastrados - 1];
                                ninjas[ninjascadastrados - 1] = null;
                                ninjascadastrados--;

                                System.out.println("Ninja " + ninjaRemovido + " deletado com sucesso!");
                            }
                            break;
                        }
                case 4:
                    System.out.println("Saindo do menu...Aguarde!");
                    break;
                default:
                    System.out.println("Nenhum número selecionado!Voltando ao menu");
                    break;
            }
        }

        scanner.close();

    }
}
