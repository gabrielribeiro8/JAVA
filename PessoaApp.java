import java.util.List;
import java.util.Scanner;

public class PessoaApp {
    public static void main(String[] args) {
        PessoaService pessoaService = new PessoaService();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Pessoa");
            System.out.println("2. Listar Pessoas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha

                    Pessoa pessoa = new Pessoa(nome, idade);
                    pessoaService.salvarPessoa(pessoa);
                    System.out.println("Pessoa cadastrada com sucesso!");
                    break;

                case 2:
                    List<Pessoa> pessoas = pessoaService.listarPessoas();
                    if (pessoas.isEmpty()) {
                        System.out.println("Nenhuma pessoa cadastrada.");
                    } else {
                        System.out.println("\nPessoas Cadastradas:");
                        System.out.println("-------------------------------");
                        System.out.printf("%-20s | %s%n", "Nome", "Idade");
                        System.out.println("-------------------------------");
                        for (Pessoa p : pessoas) {
                            System.out.println(p);
                        }
                        System.out.println("-------------------------------");
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }
}