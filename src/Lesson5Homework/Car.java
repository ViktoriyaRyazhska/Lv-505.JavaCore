package Lesson5Homework;

public class Car {

    String type;
    int yearOfProduction;
    int engineCapacity;

    public Car(String type, int yearOfProduction, int engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }


    public static Car[] ascendingSort(Car[]cars){
        Car tmp;

        for (int i = 0; i < cars.length; i++) {
            for (int j = i + 1; j < cars.length; j++) {

                if (cars[i].yearOfProduction > cars[j].yearOfProduction) {
                    tmp = cars[j];
                    cars[i].yearOfProduction = cars[j].getYearOfProduction();
                    cars[j] = tmp;

                }
            }
        }

return cars;
    }



    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    public String getType() {
        return type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

}
