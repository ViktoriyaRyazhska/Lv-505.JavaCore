package lesson9;

public class Plant {

    private String name;
    private int size;
    private Color color;
    private Type type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Plant(String name, int size, String color, String type) throws ColorException, TypeException, IllegalArgumentException {

        ColorException colorException = new ColorException();
        TypeException typeException = new TypeException();

        this.name = name;
        this.size = checkSize(size);
        this.color = colorException.colorStringToEnum(color);
        this.type = typeException.typeStringToEnum(type);
    }

    @Override
    public String toString() {
        return name +
                ", size: " + size +
                ", " + color.toString().toLowerCase() + " color" +
                ", type: " + type.toString().toLowerCase() +
                '.';
    }

    /*private Color colorStringToEnum(String color) throws ColorException {
        switch (color.toLowerCase()) {
            case "green":
                return Color.GREEN;
            case "red":
                return Color.RED;
            case "white":
                return Color.WHITE;
            case "yellow":
                return Color.YELLOW;
            case "orange":
                return Color.ORANGE;
            default:
                throw new ColorException("Available colors are: green, red, white, orange, yellow.");

        }
    }*/

    /*private Type typeStringToEnum(String type) throws TypeException {
        switch (type.toLowerCase()) {
            case "berry":
                return Type.BERRY;
            case "flower":
                return Type.FLOWER;
            case "fruit":
                return Type.FRUIT;
            case "vegetable":
                return Type.VEGETABLE;
            default:
                throw new TypeException("Available types are: berry, flower, fruit, vegetable.");
        }
    }*/

    private int checkSize(int size) throws IllegalArgumentException {
        if (size < 1) {
            throw new IllegalArgumentException("Size must be positive.");
        }
        return size;
    }
}
