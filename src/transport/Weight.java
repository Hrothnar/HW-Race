package transport;

public enum Weight {
    N1("С полной массой до 3х тонн"),
    N2("С полной массой от 3х до 12ти тонн"),
    N3("С полной массой свыше 12ти тонн");

    final String capacity;

    Weight(String capacity) {
        this.capacity = capacity;
    }

    public String getCapacity() {
        return capacity;
    }

    public static void checkType(Weight type) {
        if (type != null) {
            for (Weight lType : Weight.values()) {
                if (lType.equals(type)) {
                    System.out.println(lType.name());
                    System.out.println(lType.getCapacity());
                }
            }
        } else {
            System.out.println("Данных не достаточно");
        }
    }
}
