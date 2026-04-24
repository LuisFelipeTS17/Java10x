package NivelIntermediario.Records;

public class Main {
    public static void main(String[] args) {
        Ninja cadastro = new Ninja("Naruto Uzumaki", "Naruto@email.com", 99999999);

        System.out.println("Nome do cadastro" + cadastro.getNome());

        NinjaRecords cadastroUsandoRecord = new NinjaRecords("Sasuke Uchiha", "SasukeRevoltado@gmail.com", 999999999);
        System.out.println(cadastroUsandoRecord.emailCaixaAlta());
        System.out.println(cadastroUsandoRecord.nome());

    }
}
