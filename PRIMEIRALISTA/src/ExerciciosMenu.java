import java.util.Random;
import java.util.Scanner;

public class ExerciciosMenu {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao;

        do {
            System.out.println("\n========= MENU =========");
            System.out.println("1 - Operações básicas");
            System.out.println("2 - Média de notas");
            System.out.println("3 - Par ou Ímpar");
            System.out.println("4 - Maior entre 3 números");
            System.out.println("5 - Ano Bissexto");
            System.out.println("6 - Calculadora");
            System.out.println("7 - Login");
            System.out.println("8 - Contagem 1 a 100");
            System.out.println("9 - Tabuada");
            System.out.println("10 - Soma de 1 até N");
            System.out.println("11 - Fatorial");
            System.out.println("12 - Número Primo");
            System.out.println("13 - Caixa Eletrônico");
            System.out.println("14 - Jogo de Adivinhação");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    operacoesBasicas();
                    break;

                case 2:
                    mediaNotas();
                    break;

                case 3:
                    parOuImpar();
                    break;

                case 4:
                    maiorTresNumeros();
                    break;

                case 5:
                    anoBissexto();
                    break;

                case 6:
                    calculadora();
                    break;

                case 7:
                    login();
                    break;

                case 8:
                    contagem();
                    break;

                case 9:
                    tabuada();
                    break;

                case 10:
                    somaAteN();
                    break;

                case 11:
                    fatorial();
                    break;

                case 12:
                    numeroPrimo();
                    break;

                case 13:
                    caixaEletronico();
                    break;

                case 14:
                    jogoAdivinhacao();
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }

    // ================= MÉTODOS =================

    static void operacoesBasicas() {
        int a = 20, b = 10;
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
    }

    static void mediaNotas() {
        System.out.print("Digite 3 notas: ");
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        if (media >= 7)
            System.out.println("Aprovado");
        else if (media >= 5)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");
    }

    static void parOuImpar() {
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        if (num % 2 == 0)
            System.out.println("Par");
        else
            System.out.println("Ímpar");
    }

    static void maiorTresNumeros() {
        System.out.print("Digite 3 números: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int maior = Math.max(a, Math.max(b, c));
        System.out.println("Maior: " + maior);
    }

    static void anoBissexto() {
        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0))
            System.out.println("Ano bissexto");
        else
            System.out.println("Ano não bissexto");
    }

    static void calculadora() {
        System.out.print("Digite dois números: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.print("Operador (+ - * /): ");
        char op = scanner.next().charAt(0);

        if (op == '+')
            System.out.println("Resultado: " + (a + b));
        else if (op == '-')
            System.out.println("Resultado: " + (a - b));
        else if (op == '*')
            System.out.println("Resultado: " + (a * b));
        else if (op == '/') {
            if (b != 0)
                System.out.println("Resultado: " + (a / b));
            else
                System.out.println("Divisão por zero!");
        } else
            System.out.println("Operador inválido");
    }

    static void login() {
        scanner.nextLine();
        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        System.out.print("Usuário: ");
        String usuario = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta))
            System.out.println("Acesso permitido");
        else if (!usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta))
            System.out.println("Acesso negado usuário");
        else if (usuario.equals(usuarioCorreto) && !senha.equals(senhaCorreta))
            System.out.println("Acesso negado senha");
        else
            System.out.println("Acesso negado usuário e senha");
    }

    static void contagem() {
        System.out.println("Contagem com FOR:");
        for (int i = 1; i <= 100; i++)
            System.out.print(i + " ");

        System.out.println("\nContagem com WHILE:");
        int i = 1;
        while (i <= 100) {
            System.out.print(i + " ");
            i++;
        }
    }

    static void tabuada() {
        System.out.print("Digite número: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++)
            System.out.println(n + " x " + i + " = " + (n * i));
    }

    static void somaAteN() {
        System.out.print("Digite N: ");
        int n = scanner.nextInt();
        int soma = 0;

        for (int i = 1; i <= n; i++)
            soma += i;

        System.out.println("Soma: " + soma);
    }

    static void fatorial() {
        System.out.print("Digite número: ");
        int n = scanner.nextInt();
        long fat = 1;

        for (int i = 1; i <= n; i++)
            fat *= i;

        System.out.println("Fatorial: " + fat);
    }

    static void numeroPrimo() {
        System.out.print("Digite número: ");
        int n = scanner.nextInt();
        boolean primo = true;

        if (n <= 1) primo = false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                primo = false;
                break;
            }
        }

        if (primo)
            System.out.println("É primo");
        else
            System.out.println("Não é primo");
    }

    static void caixaEletronico() {
        double saldo = 1000;
        int opcao;

        do {
            System.out.println("\n1-Ver saldo 2-Sacar 3-Depositar 4-Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo: " + saldo);
                    break;

                case 2:
                    System.out.print("Valor: ");
                    double saque = scanner.nextDouble();
                    if (saque <= saldo)
                        saldo -= saque;
                    else
                        System.out.println("Saldo insuficiente");
                    break;

                case 3:
                    System.out.print("Valor: ");
                    double dep = scanner.nextDouble();
                    saldo += dep;
                    break;
            }

        } while (opcao != 4);
    }

    static void jogoAdivinhacao() {
        Random random = new Random();
        int secreto = random.nextInt(100) + 1;
        int tentativa;
        int tentativas = 0;

        do {
            System.out.print("Adivinhe (1-100): ");
            tentativa = scanner.nextInt();
            tentativas++;

            if (tentativa > secreto)
                System.out.println("Menor!");
            else if (tentativa < secreto)
                System.out.println("Maior!");

        } while (tentativa != secreto);

        System.out.println("Acertou em " + tentativas + " tentativas!");
    }
}