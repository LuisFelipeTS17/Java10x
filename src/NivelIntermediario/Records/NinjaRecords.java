package NivelIntermediario.Records;

public record NinjaRecords(String nome, String email, int telefone) {
    /**
     *
     * public record NinjaRecords ( String nome, int ID)
     *
     */
    //Todos atributos sao final por padrao
    //Records nao tem te SETTERS
    //Ele cria os getters sem usar get apenas Nome como usamos em metodos convencionais
    //Quando usar do mesmo jeito de ENUMS, quando voce sabe que algo vai ser constante

    //Uma regra de formatacao
    public String emailCaixaAlta(){
        return email.toUpperCase();
    }
}
