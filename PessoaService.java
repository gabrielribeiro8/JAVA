import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PessoaService {
    private static final String FILE_NAME = "pessoas.txt";

    public void salvarPessoa(Pessoa pessoa) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(pessoa.getNome() + "," + pessoa.getIdade());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados: " + e.getMessage());
        }
    }

    public List<Pessoa> listarPessoas() {
        List<Pessoa> pessoas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(",");
                String nome = dados[0];
                int idade = Integer.parseInt(dados[1]);
                pessoas.add(new Pessoa(nome, idade));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nenhum dado encontrado. Cadastre uma pessoa primeiro.");
        } catch (IOException e) {
            System.out.println("Erro ao ler os dados: " + e.getMessage());
        }
        return pessoas;
    }
}