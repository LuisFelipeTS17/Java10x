package NivelIntermediario.Classes_abstratas_interfaces;

public abstract class Ninja {
    String nome;
    String aldeia;
    int idade;


    //Metodo abstrato
     public abstract void nomeDoNinja();

    public void usaTaijutsu(){
        System.out.println("E vou usar Taijutsu!");
    }

    public abstract void tacarKunai();
}
