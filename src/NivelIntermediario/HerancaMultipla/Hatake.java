package NivelIntermediario.HerancaMultipla;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface, HokageInterface{

    public void ninjaDeElite() {
        System.out.println("Parebens! " + nome + " você agora é um Anbu" );
    }

    public void boasVindas() {
        System.out.println(nome + ": eu sou um Hatake ");
    }

    // Metodo da interface
    public void shariganAtivado(){
        System.out.println(nome + " Sharingan Ativado");
    }

    @Override
    public void hokageAtivo() {
        System.out.println(nome + "Você é um Hokage de Konoha");
    }
}
