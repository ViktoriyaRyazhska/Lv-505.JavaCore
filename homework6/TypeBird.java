package homework6;

public enum TypeBird {
    EAGLE {
        @Override
        public String print() {
            return "eagle";
        }
    }, SWALLOW {
        @Override
        public String print() {
            return "swallow";
        }
    }, PENGUIN {
        @Override
        public String print() {
            return "penguin";
        }
    }, CHICKEN {
        @Override
        public String print() {
            return "chicken";
        }
    };

    public abstract String print();
}
