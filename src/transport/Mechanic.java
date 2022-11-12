package transport;

import java.util.Arrays;
import java.util.Objects;

public class Mechanic<T extends Transport> {

    private String name;
    private String workplace;
    private T[] transport;

    public Mechanic(String name, String workplace, T... transport) {
        this.name = name;
        this.workplace = workplace;
        this.transport = transport;
    }

    public String getName() {
        return name;
    }

    public String getWorkplace() {
        return workplace;
    }

    public T[] getTransport() {
        return transport;
    }

    public void doDiagnostic(T transport) {
        if (transport instanceof Car)
            ((Car) transport).passDiagnostics();
        if (transport instanceof Truck)
            ((Truck) transport).passDiagnostics();
    }

    public void repairTransport() {
        for (Transport one : transport)
            System.out.println("Машина " + one.getBrand() + " " + one.getModel() + " отремонтирована");
    }

    @Override
    public String toString() {
        return this.name + "  Место работы: " + this.workplace;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(name, mechanic.name) && Objects.equals(workplace, mechanic.workplace) && Arrays.equals(transport, mechanic.transport);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, workplace);
        result = 31 * result + Arrays.hashCode(transport);
        return result;
    }
}
