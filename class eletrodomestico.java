class Eletrodomestico {
    String marca;
    double potencia;

    public Eletrodomestico(String marca, double potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }

    public void ligar() {
        System.out.println("Eletrodoméstico ligado.");
    }
}

class Geladeira extends Eletrodomestico {
    double capacidade;

    public Geladeira(String marca, double potencia, double capacidade) {
        super(marca, potencia);
        this.capacidade = capacidade;
    }

    @Override
    public void ligar() {
        System.out.println("Geladeira " + marca + " ligada. Potência: " + potencia + "W, Capacidade: " + capacidade + "L.");
    }
}

class Microondas extends Eletrodomestico {
    int tempoMaximo;

    public Microondas(String marca, double potencia, int tempoMaximo) {
        super(marca, potencia);
        this.tempoMaximo = tempoMaximo;
    }

    @Override
    public void ligar() {
        System.out.println("Microondas " + marca + " ligado. Potência: " + potencia + "W, Tempo máximo: " + tempoMaximo + " minutos.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Geladeira e Microondas
        Geladeira geladeira = new Geladeira("Samsung", 150, 300);
        Microondas microondas = new Microondas("LG", 1200, 15);

        geladeira.ligar();
        microondas.ligar();
    }
}
