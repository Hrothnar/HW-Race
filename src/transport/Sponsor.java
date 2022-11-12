package transport;

import java.util.Objects;

public abstract class Sponsor {
    private String name;
    private int support;

    public Sponsor(String name, int support) {
        this.name = name;
        this.support = support;
    }

    public String getName() {
        return name;
    }

    public int getSupport() {
        return support;
    }

    public void sponsorStars() {
        System.out.println("На ваш счёт поступили средства от спонсора в размере " + this.support);
    }

    @Override
    public String toString() {
        return this.name + "   Размер поддержки: " + this.support + " руб.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return support == sponsor.support && Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, support);
    }
}
