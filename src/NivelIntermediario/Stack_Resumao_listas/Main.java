package NivelIntermediario.Stack_Resumao_listas;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("========== ARRAYS ==========");
        //ARRAYS
        //Arrays staticos e referencia de memoria
        String[] ninjaArray = new String[5];
        ninjaArray[0] = "Naruto Uzumaki";
        System.out.println(ninjaArray[0]);
        System.out.println("============================");

        System.out.println();

        System.out.println("========== LISTAS ==========");
        //LISTAS -
        //Listas sao dinamicas e tamanho aumenta e diminui conforme precisa
        List<String> ninjasList = new ArrayList();
        ninjasList.add("Naruto");
        ninjasList.add("Sasuke");
        ninjasList.add("Naruto");
        System.out.println(ninjasList);

        System.out.println("============================");

        System.out.println();

        System.out.println("========== STACKS ==========");

        //STACK - LIFO
        // O ultimo elemento que entrou é obrigatorioamente o primeiro a sair - FILO

        Stack<String> ninjaStack = new Stack<>();
        //Adicionar algo a lista

        ninjaStack.push("Naruto Uzumaki");
        ninjaStack.push("Kakashi Hatake");
        ninjaStack.push("Sasuke Uchiha");
        ninjaStack.push("Sakura Haruno");
        System.out.println("ninjaStack = " + ninjaStack);
        ninjaStack.pop();
        System.out.println("ninjaStack atualizada com pop: " + ninjaStack);
        ninjaStack.peek();
        System.out.println("Quem é proximo item da lista: " + ninjaStack.peek());
        System.out.println("Tamanho da Lista: " + ninjaStack.size() + " elementos");
        //remover algo da lista - pensamento em pilha, quem esta no topo e removido
        ninjaStack.pop();
        //Olhar quem é o proximo elemento
        ninjaStack.peek();
        //Olhar o tamanho SIZE
        ninjaStack.size();
        System.out.println("============================");

        System.out.println();






    }
}
