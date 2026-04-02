package ReferenciaMemoriaEValorMemoriaTOSTRING;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------Naruto Uzumaki----------------");
        Uzumaki naruto = new Uzumaki(" Naruto Uzumaki", " Aldeia da Folha", 18, NivelNinja.KAGE);
        System.out.println(naruto);

        System.out.println("-----------Sasuker Uchiha----------------");
        Uchiha sasuke = new Uchiha("Sasuke uchiha", " Aldeia da Folha", 18);
        System.out.println(sasuke);
    }
}
