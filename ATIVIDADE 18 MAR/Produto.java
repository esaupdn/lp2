public class Produto {
    String nome;
    double preco;

    // Construtor completo
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Construtor com apenas nome
    public Produto(String nome) {
        this.nome = nome;
        this.preco = 0.0;
    }

    public void exibir() {
        System.out.println("Produto: " + nome + " | Preço: " + preco);
    }
}