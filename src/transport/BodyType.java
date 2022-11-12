package transport;

public enum BodyType {
    SEDAN,
    HATCHBACK,
    COUPE,
    UNIVERSAL,
    SUV,
    CROSSOVER,
    PICKUP,
    VAN,
    MINIVAN;

    private String bodyType;

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public static void checkType(BodyType type) {
        if (type != null) {
            for (BodyType bodyType : BodyType.values()) {
                if (bodyType.equals(type)) {
                    System.out.println(bodyType.name());
                    System.out.println(bodyType.getBodyType());
                }
            }
        } else {
            System.out.println("Данных не достаточно");
        }
    }
}
