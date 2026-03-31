package NivelBásico.Condicoes;

public class Array {
    public static void main(String[] args) {

        // Arrays são tipo referencia !
        // String se inicializa como Null!
        String [] ninja = new String[6];
        ninja[0] = "Naruto uzumake";
        ninja[1] = "Sauke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hatake";
       // System.out.println(ninja[5]);

        //Redeclarar Array
        ninja = new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        ninja[3] = "Minato Namikaze";
        ninja[4] = "Tsunade Senju";
        ninja[5] = "Kakashi Hatake";
        ninja[6] = "Naruto Uzumaki";
        System.out.println(ninja[2]);

        // For para fazer um loop em um array para aparecer todos os nomes do Array
        for (int i = 0; i < 7; i++) {
            System.out.println(ninja[i]);
        }


        // Redeclarar
        String nomeNinja = "Naruto Uzumaki";
        nomeNinja = "Boruto Uzumaki";
        System.out.println(nomeNinja);

        // Array idade -  se inicializa como 0
        int [] idade = new int[4];
        idade[0] = 16;
        idade[1] = 16;
        idade[2] = 16;
        idade[3] = 16;

        // boolean como false
        boolean [] verdadeOuFalso = new boolean[1];
        System.out.println(verdadeOuFalso[0]);

        // Double inicializam como - 0.0
        double[] flutuante = new double[1];
        System.out.println(flutuante[0]);

        System.out.println("O ninja no cadastro 2 é: " + ninja[2] );
        System.out.println("E ela tem " + idade[2] + " anos");
    }
}
