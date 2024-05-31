import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals= new ArrayList<>();
        Gato gato=new Gato("Gato");
        Pato pato=new Pato("Pato");
        Perro perro=new Perro("Perro");

        animals.add(gato);
        animals.add(pato);
        animals.add(perro);

        ReinoAnimal reinoAnimal=new ReinoAnimal(animals);

        for (Animal animal : animals) {
            animal.comer();
        }

    }
}
