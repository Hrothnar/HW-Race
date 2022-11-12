package transport;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Driver<T extends Transport & Competing> {

    private String name;
    private char drivingLicense;
    private double standing;
    private T transport;
    public static Set<Driver> drivers = new HashSet<>(20);
    private static final char[] LICENSES = new char[]{'B', 'b', 'C', 'c', 'D', 'd'};

    public final String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank()) this.name = name;
    }

    public final char getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(char drivingLicense) {
        try {
            for (char license : LICENSES) {
                if (drivingLicense == license) {
                    this.drivingLicense = drivingLicense;
                    break;
                }
            }
            if (this.drivingLicense == 0)
                throw new IllegalArgumentException("Необходимо указать корректный тип прав у водителя " + this.getName());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public final double getStanding() {
        return standing;
    }

    public void setStanding(double standing) {
        if (standing > 0) this.standing = standing;
    }
    public T getTransport() {
        return transport;
    }

    public Set<Driver> getDrivers() {
        return drivers;
    }

    public Driver(String name, char drivingLicense, double standing, T transport) {
        setName(name);
        setDrivingLicense(drivingLicense);
        setStanding(standing);
        this.transport = transport;
    }

    public void move() {
        System.out.println("Начать движение");

    }

    public void stop() {
        System.out.println("Остановиться и заглушить мотор");

    }

    public void refill() {
        System.out.println("Заправиться");
    }

    public void drive(T transport) {
        System.out.println("Водитель " + getName() + " управляет автомобилем " + transport.getBrand() + " " + transport.getModel() + " и будет участвовать в заезде");

    }
    public void bindDriver() {
        this.getTransport().setDriver(this);
    }



}
