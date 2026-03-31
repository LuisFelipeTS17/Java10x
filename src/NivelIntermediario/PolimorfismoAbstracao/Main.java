package NivelIntermediario.PolimorfismoAbstracao;

public class Main {


    public static void main(String[] args) {
        //Obj Ninja nao da pra ser criado

        // Obj Uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia= "Aldeia da Folha";
        naruto.idade = 16;

        naruto.estrategiaDeBatalhaNinja();
        naruto.habilidadeEspecial();


       // Object Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 17;
        sasuke.habilidadeEspecial();

        // Object Uchiha 2
        Uchiha itachi = new Uchiha("nome", "Konoha", 23);
        itachi.estrategiaDeBatalhaNinja();

    }
}
