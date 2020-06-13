package lesson9;

public class ColorException extends Exception{

    public ColorException() {
    }

    public ColorException(String message) {
        super(message);
    }

    Color colorStringToEnum(String color) throws ColorException {
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
    }
}
