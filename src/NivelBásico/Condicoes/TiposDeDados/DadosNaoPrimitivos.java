package NivelBásico.Condicoes.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {

     /*
     * Dados nao primirivos: String, Array, Class, enum
     * Objetivo da aula: Criar um ninja, e atribuir metodos a ele
    * */
        String nome = "Naruto Uzumaki";
        String nomeEmCaixaAlta =  nome.toUpperCase(); //toUpperCase vai deixar tudo em capsLock
        System.out.println("Com CAPSLOCK: " + nomeEmCaixaAlta);
        System.out.println("SEM capslock" + nome);

        String aldeia = "ALDEIA DA FOLHA";
        String nomealdeia = aldeia.toLowerCase(); // toLowerCase vai colocar tudo em caixa baixa/minuscula;
        System.out.println(nomealdeia);

        String nomeNinja = "Sasuke Uchiha ";
        String nomeNinjaMD = nomeNinja.concat("Uzumaki");
        System.out.println(nomeNinjaMD);


    }
}
