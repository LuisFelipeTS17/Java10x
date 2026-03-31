package NivelIntermediario.PolimorfismoAbstracao;

public class Uzumaki extends Ninja {
    // Sobreescrever o metodo da classe Ninja

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + "e esse é meu nome ninja");
    }
}
