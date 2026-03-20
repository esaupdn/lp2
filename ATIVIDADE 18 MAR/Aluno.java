public class Aluno {
    String nome;
    double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public void exibir() {
        System.out.println("Aluno: " + nome + " | Nota: " + nota);
    }
}