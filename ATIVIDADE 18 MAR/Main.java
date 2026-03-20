import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        // TESTE PRODUTO
        
        Produto p1 = new Produto("Notebook", 3000);
        Produto p2 = new Produto("Mouse");

        p1.exibir();
        p2.exibir();

    
        // TESTE ALUNO
       
        Aluno a1 = new Aluno("João", 8);
        Aluno a2 = new Aluno("Maria", 9);
        Aluno a3 = new Aluno("Pedro", 7);

        a1.exibir();
        a2.exibir();
        a3.exibir();

        
        // TESTE CARRO
       
        Carro c1 = new Carro("Toyota", 2020);
        Carro c2 = new Carro();

        c2.marca = "Honda";
        c2.ano = 2018;

        c1.exibir();
        c2.exibir();

        
        // TESTE PESSOA
       
        Pessoa pessoa = new Pessoa("Carlos", 150); // inválido
        pessoa.exibir();

        
        // TESTE CONTA
        
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(100);
        conta.sacar(50);
        conta.sacar(200);

        System.out.println("Saldo: " + conta.obterSaldo());

        
        // TESTE POLIMORFISMO
       
        Animal[] animais = new Animal[2];
        animais[0] = new Cachorro("Rex");
        animais[1] = new Gato("Mimi");

        for (Animal animal : animais) {
            animal.emitirSom();
        }

        
        // MENU CALCULADORA
        
        Calculadora calc = new Calculadora();
        int opcao;

        do {
            System.out.println("\n=== CALCULADORA ===");
            System.out.println("1 - Somar 2 inteiros");
            System.out.println("2 - Somar 3 inteiros");
            System.out.println("3 - Somar decimais");
            System.out.println("4 - Subtrair");
            System.out.println("5 - Multiplicar");
            System.out.println("6 - Dividir");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();

            double a, b;
            int x, y, z;

            switch (opcao) {
                case 1:
                    x = sc.nextInt();
                    y = sc.nextInt();
                    System.out.println(calc.somar(x, y));
                    break;
                case 2:
                    x = sc.nextInt();
                    y = sc.nextInt();
                    z = sc.nextInt();
                    System.out.println(calc.somar(x, y, z));
                    break;
                case 3:
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println(calc.somar(a, b));
                    break;
                case 4:
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println(calc.subtrair(a, b));
                    break;
                case 5:
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println(calc.multiplicar(a, b));
                    break;
                case 6:
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println(calc.dividir(a, b));
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}