package Desafios.Desafio06;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Ninja sasuke = new Ninja("Sasuke", 18, "Konoha");
        Ninja sakura = new Ninja("Sakura", 18, "Konoha");
        Ninja naruto = new Ninja("Naruto", 18, "Konoha");
        Ninja kakashi = new Ninja("Kakashi", 40, "Konoha");
        Ninja hinata = new Ninja("Hinata",18,"Konoha" );
        Ninja itachi = new Ninja("Itachi",  38, "Konoha");
        Ninja shikamaru = new Ninja("Shikamaru",  18, "Konoha");


        LinkedList<Ninja> ninjas = new LinkedList<>();
        ninjas.add(sasuke);
        ninjas.add(naruto);
        ninjas.add(sakura);
        ninjas.add(kakashi);
        ninjas.add(hinata);
        ninjas.add(itachi);
        ninjas.add(shikamaru);


        for (Ninja ninja : ninjas) {
            System.out.println(ninja);
        }

        ninjas.remove(0);
        System.out.println(ninjas);

        ninjas.addLast(sasuke);
        System.out.println("Adicionado ao ultimo: " + ninjas);

        System.out.println("Acessar por index: " + ninjas.get(0));

        ninjas.addFirst(hinata);
        System.out.println("Adicionado a primeira posição da lista: " + ninjas);



    }
}
