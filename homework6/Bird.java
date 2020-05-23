package study.homework6;

public abstract class Bird {

    private TypeBird type;
    private int year;
    private String feathers;
    private int layEggs;

    public TypeBird getType() {
        return type;
    }

    public void setType(TypeBird type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String  getFeathers() {
        return feathers;
    }

    public void setFeathers(String  feathers) {
        this.feathers = feathers;
    }

    public int getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(int layEggs) {
        this.layEggs = layEggs;
    }

    public abstract void fly();

    public void output() {
        System.out.println("I`m a "+this.type.print()+". I'm "+this.year+" years.");
        System.out.println("Color of my feathers is "+this.feathers+".");
        System.out.println("Now I can lay "+ this.layEggs+" eggs a season.");
    }
}
