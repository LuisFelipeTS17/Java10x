package NivelBásico.Condicoes;

public class IfEElse {
    public static void main(String[] args) {
         /*
        *If e Else - Condições
        *else if (condicao) {resultado}
        *else {resuktado caso nada seja verdadeiro}
       *Objetivo: Passar o numero de nivel de acordo com o numero de missoes
        * */


        // Ninja Naruto
        String nome = "Naruto";
        String rank;
        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 10;

        /*
         * if (condicao) { resultado}
         * */

        // se (condicao) {faça isso}

        if (numeroDeMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunnin");

        }else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennimn ");
        }

    }

}
