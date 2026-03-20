public class Pessoa {
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0 && idade <= 100) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida! Será definida como 0.");
            this.idade = 0;
        }
    }

    public void exibir() {
        System.out.println("Pessoa: " + nome + " | Idade: " + idade);
    }
}