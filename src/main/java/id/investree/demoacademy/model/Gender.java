package id.investree.demoacademy.model;

public enum Gender {
    MALE {
        @Override
        public String toString() {
            return "male";
        }
    },
    FEMALE {
        @Override
        public String toString() {
            return "female";
        }
    }

}
