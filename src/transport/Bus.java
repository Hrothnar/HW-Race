package transport;

public class Bus extends Transport implements Competing {
    private Capacity capacity;
    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    @Override
    public void move() {

    }

    @Override
    public void stop() {

    }
    @Override
    public void pitStop() {
        System.out.println("Есть пит-строп");

    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга у автобусов 6:02");

    }

    @Override
    public String maxSpeed() {
        return "224 км/ч";
    }

    public Capacity getCapacity() {
        return capacity;
    }
}
