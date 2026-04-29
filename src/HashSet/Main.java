package HashSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        List<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Sasuke Uchiha");
        ninjas.add("Sakura Haruno");
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Danzou");
        ninjas.add("Kakashi Hatake");
        ninjas.add("Boruto");
        System.out.println("ninjas = " + ninjas);



    //TreeSet usado em uma ordem sequencia correta da ioteracao
        // String ordem alfabetica
    //Se fosse int seria por ordem numerica
        Set<String> ninjasSet = new TreeSet<>();
        ninjasSet.addAll(ninjas);

        System.out.println("ninjasSet = " + ninjasSet);
    }
}
