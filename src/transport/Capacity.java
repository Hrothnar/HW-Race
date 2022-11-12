package transport;

import java.net.CacheRequest;

public enum Capacity {
    ESPECIALLY_SMALL("Особо малая до 10 мест"),
    SMALL("Малая до 25 мест"),
    MIDDLE("Средняя от 40 до 50 мест"),
    BIG("Большая от 60 до 80 мест"),
    ESPECIALLY_BIG("Особо большая от 100 до 120 мест");

    final String capacity;

    Capacity(String capacity) {
        this.capacity = capacity;
    }

    public String getCapacity() {
        return capacity;
    }

    public static void checkType(Capacity type) {
        if (type != null) {
            for (Capacity cap : Capacity.values()) {
                if (cap.equals(type)) {
                    System.out.println(cap.name());
                    System.out.println(cap.getCapacity());
                }
            }
        } else {
            System.out.println("Данных не достаточно");
        }
    }
}
