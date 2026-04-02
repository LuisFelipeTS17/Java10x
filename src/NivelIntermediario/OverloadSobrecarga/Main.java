package NivelIntermediario.OverloadSobrecarga;

public class Main {

    public static void main(String[] args) {
        //Obj Ninja nao da pra ser criado

        // Obj Uzumaki
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 18, 200, NivelNinja.JOUNIN);
        naruto.habilidadeEspecial();
        naruto.jutsuVento();

       // Object Uchiha
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha",18, 20, NivelNinja.CHUUNIN);
        sasuke.habilidadeEspecial();

        // Object Uchiha 2
        Uchiha itachi = new Uchiha("Itachi", "Konoha", 23);
        itachi.estrategiaDeBatalhaNinja();

        // Obj Uchiha 3
        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da Folha", 45, 900, NivelNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();
        madara.ativarSharigan();
        //Metodo comum
        madara.inteligenciaDeCombate();
        //Metoddo sobrecarregado
        madara.inteligenciaDeCombate(180);

    }
}
