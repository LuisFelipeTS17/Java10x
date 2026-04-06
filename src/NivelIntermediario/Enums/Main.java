package NivelIntermediario.Enums;

public class Main {
    public static void main(String[] args) {

        Missoes missao1 = new Missoes("Salvar gato do Hokage", RankDeMissoes.D);
        missao1.exibirDeatalhes();

        Missoes missao2 = new Missoes("Reconhecimento",  RankDeMissoes.B);
        missao2.exibirDeatalhes();

    }
}
