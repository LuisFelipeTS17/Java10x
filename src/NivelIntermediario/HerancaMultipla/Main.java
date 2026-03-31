package NivelIntermediario.HerancaMultipla;

public class Main {
    public static void main(String[] args) {

        //Obj Sasuke
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 18;
        sasuke.shariganAtivado();


        //Obj Hatake
        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi Hatake";
        kakashi.aldeia = "Aldeia da Folha";
        kakashi.idade = 34;
        kakashi.boasVindas();
        kakashi.shariganAtivado();
        kakashi.ninjaDeElite();

    }
}
