package GenericsExample;

import java.util.List;

public class Arrivary<T extends Animal> {

    public List<T> getAnimals() {
        return animals;
    }

    public void setAnimals(List<T> animals) {
        this.animals = animals;
    }

    List<T>animals;






}
