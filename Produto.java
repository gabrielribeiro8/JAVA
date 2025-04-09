public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double calcularValorTotal() {
        return preco * quantidade;
    }
}
public class Main {
    public static void main(String[] args) {
        
        Produto produto = new Produto("Notebook", 2500.00, 10);

        produto.setNome("Notebook Gamer");
        produto.setPreco(3000.00);
        produto.setQuantidade(5);

        // Exibindo os atributos e o valor total do estoque
        System.out.println("Nome do Produto: " + produto.getNome());
        System.out.println("Preço do Produto: R$ " + produto.getPreco());
        System.out.println("Quantidade em Estoque: " + produto.getQuantidade());
        System.out.println("Valor Total do Estoque: R$ " + produto.calcularValorTotal());
    }
}