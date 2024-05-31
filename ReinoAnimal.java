import java.util.List;

public class ReinoAnimal {
    List<Animal> animal;

    public ReinoAnimal(List<Animal> animal){
        this.animal=animal;
    }

    public List<Animal> getAnimal() {
        return animal;
    }

    public void setAnimal(List<Animal> animal) {
        this.animal = animal;
    }
}
