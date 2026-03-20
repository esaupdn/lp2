public class Carro {
    String marca;
    int ano;

    // Construtor vazio
    public Carro() {
    }

    // Construtor com parâmetros
    public Carro(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public void exibir() {
        System.out.println("Carro: " + marca + " | Ano: " + ano);
    }
}