package transport;

import java.util.*;

public abstract class Transport {

    private String brand;
    private String model;
    private double engineVolume;
    private Driver driver;
    private Set<Mechanic> mechanics = new HashSet<>(2);
    private Set<Sponsor> sponsors = new HashSet<>();
    public static ArrayList<Transport> autoPark = new ArrayList<>(12);

    {
        this.brand = "default";
        this.model = "default";
        this.engineVolume = 1;
    }

    protected Transport(String brand, String model, double engineVolume) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
    }

    public final String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.isBlank())
            this.brand = brand;
    }

    public final String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.isBlank())
            this.model = model;
    }

    public final double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume > 0)
            this.engineVolume = engineVolume;
    }

    public ArrayList<Transport> getAutoPark() {
        return autoPark;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public Set<Mechanic> getMechanics() {
        return mechanics;
    }

    public abstract void move();

    public abstract void stop();


    public static void showStatusOfDiagnostic() {
        try {
            for (Transport one : autoPark) {
                if (one instanceof Car && !((Car) one).isPassedTheDiagnostic()) {
                    if (!((Car) one).isPassedTheDiagnostic()) {
                        throw new Exception("Необходимо пройти диагностику транспортного средства " + one.getBrand() + " " + one.getModel());
                    }
                }
                if (one instanceof Truck) {
                    if (!((Truck) one).isPassedTheDiagnostic()) {
                        throw new Exception("Необходимо пройти диагностику транспортного средства " + one.getBrand() + " " + one.getModel());
                    }
                }
                if (one instanceof Bus)
                    System.out.println("Автобусы в диагностике не нуждаются");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void showInfo() {
        for (int i = 0; i < autoPark.size(); i++) {
            int j = 0, h = 0;
            System.out.printf("Автомобиль: %s %s | Водитель: %s\n", autoPark.get(i).getBrand(), autoPark.get(i).getModel(), autoPark.get(i).getDriver().getName());
            for (Mechanic one : autoPark.get(i).mechanics)
                System.out.println("Механик: " + one);
            for (Sponsor one : autoPark.get(i).sponsors)
                System.out.println("Спонсор: " + one);
            System.out.println();
        }
    }




}


