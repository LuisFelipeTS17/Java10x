package Desafio_Feitos_Pelo_Fiasco.Desafio6;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //Iniciar uma Linked list com 7 ninjas
        LinkedList<Ninja> listaDeNinja = new LinkedList<>();

        listaDeNinja.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        listaDeNinja.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        listaDeNinja.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        listaDeNinja.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        listaDeNinja.add(new Ninja("Gaara", 17, "Areia"));
        listaDeNinja.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        listaDeNinja.add(new Ninja("Temari", 18, "Areia"));

       //Listar Ninja
        System.out.println("Lista de ninjas: ");

        System.out.println("-------------- LISTA NINJA --------------");
        //Complexidade O(N)
        for (Ninja ninja : listaDeNinja) {
            System.out.println(ninja);
        }

        // Adicionar o ninja no inicio da lista
        listaDeNinja.addFirst(new Ninja("Boruto", 9, "Konoha"));

        // Remover o ninja no inicio da List
        System.out.println("===========NINJA REMOVIDO==============");
        Ninja removido = listaDeNinja.removeFirst();
        System.out.println("Ninja removido removido = " + removido);

        System.out.println("=========== LISTA DE NINJA ATUALIZADA ==============");
        //Listar os ninjas
        for (Ninja listaDeNinjasAtualizada : listaDeNinja)
            System.out.println("Lista de Ninja atualizada: " + listaDeNinjasAtualizada);

        //Procurar um ninja por Indice
        Ninja terceiroNinja = listaDeNinja.get(3);


    }
}
