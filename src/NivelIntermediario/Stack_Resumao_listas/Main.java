package NivelIntermediario.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        //Arrays
        //Arrays staticos e referencia de memoria
        String[] ninjaArray = new String[5];
        ninjaArray[0] = "Naruto Uzumaki";


        //Listas
        //Listas sao dinamicas e tamanho aumenta e diminui conforme precisa
        List<String> ninjasList = new ArrayList();
        ninjasList.add("Naruto Uzumaki");

        //Stack
        // O ultimo elemento que entrou é obrigatorioamente o primeiro a sair
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


    }
}
