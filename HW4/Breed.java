package HW4;

public enum Breed {
    AKITA {
        @Override
        public String getBreed() {
            return "Akita";
        }
    }, BOXER{
        @Override
        public String getBreed() {
            return "Boxer";
        }
    }, BULLDOG{
        @Override
        public String getBreed() {
            return "Bulldog";
        }
    }, COLLIE{
        @Override
        public String getBreed() {
            return "Collie";
        }
    }, DOBERMAN{
        @Override
        public String getBreed() {
            return "Doberman";
        }
    }, LABRADOR{
        @Override
        public String getBreed() {
            return "Labrador";
        }
    };

    public abstract String getBreed();

}
