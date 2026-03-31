package NivelIntermediario.Heranca;

public class Main {
    public static void main(String[] args) {

        //Objeto 1
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 18;
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.ModoKuramaAtivado();

        // Objeto 2
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 18;
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.ShariganAtivido();

        // String chamandoMetodo =  Sasuke.EuSouUmNinja();//System.out.println(chamandoMetodo);// int idadeParaSerHokage = Sasuke.anosParaSeTornarHokage(30);// System.out.println("Você tem: " + Sasuke.idade + " anos, falta no minimo "+ idadeParaSerHokage + " anos para você se tornar Hokage");
        // Objeto 3
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 18;
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.ativarCura();

        // Objeto 4
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hianata";
        Hinata.idade = 18;
        Hinata.aldeia = "Aldeia da folha";
        Hinata.ByakuganAtividado();

        //Objeto 4
        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Hyuga Uzumaki";
        Boruto.idade = 18;
        Boruto.aldeia = "Aldeia da folha";
        Boruto.AtivarOKarma();
        Boruto.AtivarJougan();
        Boruto.AtivarByakugan();

    }
}
