package Desafios.Desafio06;

public class Ninja {
    String nome;
    int idade;
    String vila;

    public Ninja(String nome, int idade, String vila) {
        this.nome = nome;
        this.idade = idade;
        this.vila = vila;
    }


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getVila() {
        return vila;
    }

    @Override
    public String toString() {
        return "Ninja" +
                "nome:" + nome  +
                ", idade:" + idade +
                ", vila:" + vila ;
    }
}

