package NivelIntermediario.Linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Naruto Uzumaki");
        linkedList.add("Sasuke Uchiha");
        linkedList.add("Sakura Haruno");
        System.out.println(linkedList);
        linkedList.add(1, "kakashi Hatake");
        System.out.println(linkedList);
        linkedList.remove(2);
        System.out.println(linkedList);

        linkedList.add("Felipe");
        System.out.println(linkedList);

    }
}
