package NivelIntermediario.List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Array
        String [] ninjasArray = new String[4];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";
        ninjasArray[3] = "Kakashi";
        for (int i = 0; i < ninjasArray.length ; i++) {
            System.out.println("ninjasArray[I] = " + ninjasArray[i]);

        }
        System.out.println(ninjasArray[0]);

        /**
         * TODO:Listas
         * TODO:Objetivo: Listas Não sao estaticas, elas podem começar zeradas, sao mais felxiveis, sao um arrays com super poderes.
         */

        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki"); // 0 index
        ninjasList.add("Sasuke Uchiha"); // 1 index
        ninjasList.add("Sakura Haruno");// 2 index
        ninjasList.add("Kakashi Hatake"); // 3 index

        //TODO: ADICIONAR NA LISTA
        ninjasList.add("Tobirama");
        System.out.println("ninjasList = " + ninjasList);

        //TODO: REMOVER DA LISTA
        ninjasList.remove("Naruto Uzumaki");
        System.out.println("ninjasList = " + ninjasList);

        //TODO: Trocar elementos
        ninjasList.set(0, "Felipe Nepomuceno");
        System.out.println("Troca = " + ninjasList);

        //TODO: Ver TAMANHO DA LISTA
        ninjasList.size();
        System.out.println("Tamanho da lista" + ninjasList.size() + "elementos" );


    }
}
