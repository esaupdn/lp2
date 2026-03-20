import java.util.*;

public class ExerciciosJava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=== EXERCÍCIO 1 ===");
        int numeroSorteado1 = random.nextInt(10) + 1;

        System.out.print("Digite um número entre 1 e 10: ");
        int palpite1 = scanner.nextInt();

        if (palpite1 == numeroSorteado1) {
            System.out.println("Você acertou!");
        } else {
            System.out.println("Você errou!");
        }
        System.out.println("Número sorteado: " + numeroSorteado1);

        System.out.println("\n=== EXERCÍCIO 2 ===");
        int[] numeros = new int[5];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }

        double media = soma / 5.0;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        System.out.println("\n=== EXERCÍCIO 3 ===");
        int[] aleatorios = new int[10];

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.println("Valores gerados:");
        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios[i] = random.nextInt(100) + 1;
            System.out.print(aleatorios[i] + " ");

            if (aleatorios[i] > maior) {
                maior = aleatorios[i];
            }
            if (aleatorios[i] < menor) {
                menor = aleatorios[i];
            }
        }

        System.out.println("\nMaior número: " + maior);
        System.out.println("Menor número: " + menor);

        System.out.println("\n=== EXERCÍCIO 4 ===");
        ArrayList<Integer> lista = new ArrayList<>();
        int numero;

        do {
            System.out.print("Digite um número (0 para parar): ");
            numero = scanner.nextInt();
            if (numero != 0) {
                lista.add(numero);
            }
        } while (numero != 0);

        int somaLista = 0;
        for (int n : lista) {
            somaLista += n;
        }

        double mediaLista = lista.size() > 0 ? (double) somaLista / lista.size() : 0;

        System.out.println("Quantidade de números: " + lista.size());
        System.out.println("Soma: " + somaLista);
        System.out.println("Média: " + mediaLista);

        System.out.println("\n=== EXERCÍCIO 5 ===");
        int numeroSorteado2 = random.nextInt(100) + 1;
        ArrayList<Integer> tentativas = new ArrayList<>();

        int palpite2;
        do {
            System.out.print("Tente adivinhar o número (1 a 100): ");
            palpite2 = scanner.nextInt();
            tentativas.add(palpite2);

            if (palpite2 < numeroSorteado2) {
                System.out.println("Maior");
            } else if (palpite2 > numeroSorteado2) {
                System.out.println("Menor");
            }

        } while (palpite2 != numeroSorteado2);

        System.out.println("Parabéns! Você acertou!");
        System.out.println("Número de tentativas: " + tentativas.size());
        System.out.println("Tentativas feitas: " + tentativas);

        scanner.close();
    }
}