package NivelBásico.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        /*
        * Laços de Repetição: Vão repetir infinitamente ou até voce atingir o parametro desejado
        * WHILE A= FOR
        *
        * */


        // While
        // while (condicao) { Tudo aqui vai acontecer }

        int numeroDeClone = 0;
        int numeroMaximoDeClones = 40;

        /* while (numeroDeClone <= numeroMaximoDeClones) {
            System.out.println("O Naruto fez um clone das sombras");
            numeroDeClone++;
        } */


        for (int numeroDeclone = 0; numeroDeclone <= numeroMaximoDeClones; numeroDeclone++) {
            System.out.println("O naruto esta se clonando e ja se clonou - " + numeroDeclone);
        }

    }
}
