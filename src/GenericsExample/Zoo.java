package GenericsExample;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    //List of Birds
    Arrivary<Bird>birdArrivary1;


//Не можна створити список з параметром Object так як стоїть обмеження    Arrivary<T extends Animal> {
    //Списки можна буде створювати тільки на основі класів які наслідують Animal
    //Arrivary може бути тільки типом який наслідує Animal

   // Arrivary<Object>birdArrivary1;

    public static void main(String[] args) {

        Arrivary<Bird>birdArrivary1 = new Arrivary<>();

        //Тут можна використовувати тільки список типу bird бо він наслідується від Animal
        List<Bird>animals =birdArrivary1.getAnimals();




//Знак питання ? extends дозволяє тільки считувати з Lista,додавати не можна бо стоїть обмеження extends Animal!!!!!
        List<? extends Animal>animals2 = new ArrayList<>();



//mistake
       // animals2.add(new Bird());
       // animals2.add(new Animal());


        // ? Super дозволяє і зчитувати і додавати в List  - це є Consumer який приймає

        List<? super Animal>animals3 = new ArrayList<>();
        animals3.add(new Bird());
        animals3.add(new Animal());



    }

//Producer
public void printAll( List<? extends Animal>animals2){
Animal animal = animals2.get(0);

}

    public void printAll1( List<? extends Animal>animals3){
        Animal animal = animals3.get(0);

    }








}
