abstract class Animal {
    // Método abstrato fazerSom
    public abstract void fazerSom();
}

class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O cachorro late: Au Au!");
    }
}

class Gato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O gato mia: Miau!");
    }
}

class Vaca extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("A vaca muge: Muuu!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando um array de animais
        Animal[] animais = new Animal[3];
        
        animais[0] = new Cachorro();
        animais[1] = new Gato();
        animais[2] = new Vaca();
        
        for (Animal animal : animais) {
            animal.fazerSom();
        }
    }
}
