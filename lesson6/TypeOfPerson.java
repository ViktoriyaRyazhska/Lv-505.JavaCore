package lesson6;

public enum TypeOfPerson {
    STUDENT{
        @Override
        public String getType() {
            return "student";
        }
    }, TEACHER{
        @Override
        public String getType() {
            return "teacher";
        }
    }, CLEANER{
        @Override
        public String getType() {
            return "cleaner";
        }
    };

    public abstract String getType();
}


