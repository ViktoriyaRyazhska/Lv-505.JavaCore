package HW4;

public class Car {

    private String type;
    private int yearOfProduction;
    private int engineCapacity;

    public Car(String type, int yearOfProduction, int engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
    public static void sortYear(Car[] name){
        Car tmp;
        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < name.length; j++) {
                if(name[i].getYearOfProduction() < name[j].getYearOfProduction()){
                    tmp = name[i];
                    name[i] = name[j];
                    name[j] = tmp;
                }
            }
        }
    }

}
