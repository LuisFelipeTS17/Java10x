package NivelIntermediario.EstruturaDeDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        //Array - não sao flexiveis
        System.out.println("----------- ARRAY -----------");
        String [] nomeNinjaArray = new String[3];
        nomeNinjaArray[0] = "Naruto Uzumaki";
        nomeNinjaArray[1] = "Sasuke Uchuha";
        nomeNinjaArray[2] = "Sakura Haruno";

        System.out.println("nomeNinjaArray = " + nomeNinjaArray);
        System.out.println(nomeNinjaArray[0]);

        //Listas -  sao flexiveis - Um pouco mais lenta - não temos problemas de gargalo de memoria
        System.out.println("----------- LISTAS -----------");
        List<String> cadastroNinja = new ArrayList<>();
        cadastroNinja.add("Naruto Uzumaki");
        cadastroNinja.add("Sasuke Uchiha");
        cadastroNinja.add("Sakura Haruno");
        System.out.println("cadastroNinja = " + cadastroNinja);
        System.out.println("Tamanho da Lista: " +cadastroNinja.size());

        cadastroNinja.remove("Sakura Haruno");
        System.out.println(cadastroNinja);

        cadastroNinja.set(1, "Hinata Hyuga");
        System.out.println(cadastroNinja);


        // 1) Arrays sao estaticos
        // Exigem tamnho pré definido

        // 2) Listas sao dinamicas
        // Aumentam e diminuem de tamanho conforme precisamos

        // 3 0 Stacks sao unicos
        // Exibem uma ordem! O ultimo a entrar é o primeiro a sair! (LIFO)

        System.out.println("----------- STACK -----------");
        Stack<String> nomeNinjaStack = new Stack<>();
        //adicionar nomes a pilha
        nomeNinjaStack.push("NARUTO UZUMAKI");
        nomeNinjaStack.push("SASUKE UCHIHA");
        nomeNinjaStack.push("SAKURA HARUNO");

        System.out.println(nomeNinjaStack);
        System.out.println("Tirar da pilha: " + nomeNinjaStack.pop());
        nomeNinjaStack.push("Kakashi Hatanake");
        System.out.println(nomeNinjaStack);
        //Proximo elemento do top da pilha
        System.out.println("nomeNinjaStack.peek() = " + nomeNinjaStack.peek());


    }
}
