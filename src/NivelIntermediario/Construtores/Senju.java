package NivelIntermediario.Construtores;

public class Senju extends Hokage{

    public Senju(String nome, double altura, double saldoBancaria, int missoes, String aldeia, int idade, boolean vivoOuMorto) {
        super(nome, altura, saldoBancaria, missoes, aldeia, idade, vivoOuMorto);
    }

    public void sabedoriaHokage() {
        System.out.println("Voce ganhou sabedoria");
    }
}
