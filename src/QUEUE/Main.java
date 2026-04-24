package QUEUE;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println("========== QUEUE ==========");
        // QUEUE - FIFO - FILAS - usado agendamento médio, mcdonalds
        Queue<String> ninjasQueu = new LinkedList<>();
        ninjasQueu.add("Naruto Uzumaki");
        ninjasQueu.add("Sasuke Uchiha");
        ninjasQueu.add("Sakura Haruno");
        ninjasQueu.add("Kakashi Hatake");

        //Mostrar fila:
        System.out.println("Ninjas na fila: " + ninjasQueu);

        // Tirar um ninja da fila:
        ninjasQueu.poll();
        System.out.println("Ninjas na fila depois do pool: " + ninjasQueu);

        //Como ver quem é o primeiro
        ninjasQueu.peek();
        System.out.println("Ninja no HEAD: " + ninjasQueu.peek());

        // adicionar um ninja
        ninjasQueu.add("Shikamaru");
        ninjasQueu.add("Hashirama Senju");
        ninjasQueu.add("Tobirama Senju");
        System.out.println("Adicionando ninjas a fila:" + ninjasQueu);

        //NÃO DA PRA DELETAR O TAIL SEM TIRAR TODOS ANTES

        //Esvaziar Fila
        ninjasQueu.poll();
        ninjasQueu.poll();
        ninjasQueu.poll();
        ninjasQueu.poll();
        ninjasQueu.poll();
        ninjasQueu.poll();
        System.out.println("Ninjas na fila: " + ninjasQueu);
        //Verificar se está vazia a fila
        if (ninjasQueu.isEmpty() ){
            System.out.println("A filha está vazia");
        } else {
            System.out.println("A fila está cheia!!!");
        }
        System.out.println();

        System.out.println("============================");
    }
}
