package lesson9;

public class TypeException extends Exception{

    public TypeException() {
    }

    public TypeException(String message) {
        super(message);
    }

    Type typeStringToEnum(String type) throws TypeException {
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
    }
}
