package NivelIntermediario.Classes_abstratas_interfaces;

public class Uchiha extends Ninja {

    @Override
    public void nomeDoNinja() {
        System.out.println("Meu nome ninja é: " +  nome);
    }

    @Override
    public void tacarKunai() {
        System.out.println("Eu estou jogando uma Kunai!");
    }
}
