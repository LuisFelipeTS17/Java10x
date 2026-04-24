package NivelIntermediario.Generics.Part2;

public class Main {
    public static void main(String[] args) {

        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.adicionarFerramenta(new Kunai("Kunai Explosiva"));
        bolsaNinja.adicionarFerramenta(new Shuriken(2));
        bolsaNinja.adicionarFerramenta(new Pergaminho("Kunai Explosiva"));
        bolsaNinja.adicionarFerramenta(new CompanheiroNinja("Kimarou"));

        System.out.println("Itens da nossa bolsa ninja:");
        bolsaNinja.mostrarFerramentas();



    }
}
