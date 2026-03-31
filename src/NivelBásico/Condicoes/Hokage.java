package NivelBásico.Condicoes;

public class Hokage {
    public static void main(String[] args) {

            String nome = "Naruto";
            int idade = 18;
            boolean hokage = false;
            short numeroDeMissoes = 10;

            // Exemplo 1: Negando diretamente
            if (!hokage) {  // Se NÃO é hokage (false vira true)
                System.out.println("Ainda não é Hokage");
            }

            // Exemplo 2: Negando uma condição
            if (!(idade >= 18)) {  // Se NÃO tem 18 ou mais
                System.out.println("É menor de idade");
            }

            // Exemplo 3: Combinando com &&
            if (!hokage && numeroDeMissoes < 100) {
                System.out.println("Não é Hokage E tem poucas missões");
            }

            // Exemplo 4: Negando múltiplas condições
            if (!(hokage || numeroDeMissoes >= 50)) {
                // Se NÃO (é hokage OU tem 50+ missões)
                System.out.println("Não é Hokage E não tem 50+ missões");
            }

            // Exemplo 5: Dupla negação (volta ao original)
            if (!!hokage) {  // !! cancela = volta a ser false
                System.out.println("Isso não vai executar porque hokage é false");
            }
    }
}
