package homework5;

public class Car {
    private String type;
    private int year;
    private double engCap;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getEngCap() {
        return engCap;
    }

    public void setEngCap(double engCap) {
        this.engCap = engCap;
    }

    public Car(String type, int year, double engCap) {
        this.type = type;
        this.year = year;
        this.engCap = engCap;
    }

    public static void cerYear(Car[] cars, int year) {
        System.out.println("Cars from " + year + " year:");
        for (Car car : cars) {
            if (car.year == year) {
                System.out.println(car.type);
            }
        }
    }

    @Override
    public String toString() {
        return "\'" + type + "\' " +
                year + " year of production" +
                ", engine capacity: " + engCap + '.';
    }

    public static Car[] sort(Car[] cars) {
        Car car;
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars.length - 1; j++) {
                if (cars[j].year < cars[j + 1].year) {
                    car = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = car;
                }
            }
        }
        return cars;
    }

    public static void output(Car[] cars){
        for (Car car: cars) {
            System.out.println(car.toString());
        }
    }

}
