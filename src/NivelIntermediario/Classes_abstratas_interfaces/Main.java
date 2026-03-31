package NivelIntermediario.Classes_abstratas_interfaces;

public class Main {
    public static void main(String[] args) {
        //Obj ninja



        // Obj Uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.nomeDoNinja();
        naruto.tacarKunai();

        // Obj Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome= "Sasuke Uchiha";
        sasuke.nomeDoNinja();
        sasuke.usaTaijutsu();
        sasuke.tacarKunai();

    }
}
