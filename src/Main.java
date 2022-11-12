import transport.*;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Audi", "TT", 3.5);
        Car car2 = new Car("Peugeot", "308", 1.5);
        Car car3 = new Car("Ford", "Mustang", 2.8);
        Car car4 = new Car("Honda", "Civic", 2.2);
        Truck truck1 = new Truck("Mercedes-Benz", "Actors", 12.8, Weight.N2);
        Truck truck2 = new Truck("Volvo", "FH 16 ZS", 12, Weight.N1);
        Truck truck3 = new Truck("Камаз", "4326", 18.472, Weight.N3);
        Truck truck4 = new Truck("Freightliner", "Century", 12.7, Weight.N1);
        Bus bus1 = new Bus("Ford", "Transit", 2.8, Capacity.SMALL);
        Bus bus2 = new Bus("Peugeot", "Boxer", 3.3, Capacity.SMALL);
        Bus bus3 = new Bus("Volkswagen", "Vento", 2.7, Capacity.MIDDLE);
        Bus bus4 = new Bus("Лада", "Газель", 3.7, Capacity.SMALL);

        Driver<Car> driver1 = new Driver<>("Игорь", 'b', 4.5, car1);
        Driver<Truck> driver2 = new Driver<>("Вова", 'C', 1.6, truck1);
        Driver<Bus> driver3 = new Driver<>("Саша", 'D', 3.3, bus1);
        Driver<Car> driver4 = new Driver<>("Евгений", 'B', 0.5, car2);
        Driver<Truck> driver5 = new Driver<>("Вася", 'C', 2.2, truck2);
        Driver<Bus> driver6 = new Driver<>("Виктор", 'd', 6.3, bus2);

        Transport.autoPark.add(car1);
        Transport.autoPark.add(car2);
        Transport.autoPark.add(truck1);
        Transport.autoPark.add(truck2);
        Transport.autoPark.add(bus1);
        Transport.autoPark.add(bus2);

        // ============================================================================= //

        car1.passDiagnostics();
        car2.passDiagnostics();
        car3.passDiagnostics();
        car4.passDiagnostics();
        truck1.passDiagnostics();
        truck2.passDiagnostics();
        truck3.passDiagnostics();
        truck4.passDiagnostics();

//        Transport.showStatusOfDiagnostic();

        // ============================================================================= //

        driver1.bindDriver();
        driver2.bindDriver();
        driver3.bindDriver();
        driver4.bindDriver();
        driver5.bindDriver();
        driver6.bindDriver();

        Driver.drivers.add(driver1);
        Driver.drivers.add(driver2);
        Driver.drivers.add(driver3);
        Driver.drivers.add(driver4);
        Driver.drivers.add(driver5);
        Driver.drivers.add(driver6);

        Mechanic<Car> mechanic1 = new Mechanic<>("Иван Леонидович", "Мишлен", car1);
        Mechanic<Truck> mechanic2 = new Mechanic<>("Пётр Степанович", "Тур де Франц", truck1, truck2);
        Mechanic<Bus> mechanic3 = new Mechanic<>("Александр Робинзонович", "Гранд Туризмо", bus1);
        Mechanic<Car> mechanic4 = new Mechanic<>("Максим Филиппович", "West Coast Customs", car1, car2);
        Sponsor sponsor1 = new Individual("Вася", 23400);
        Sponsor sponsor2 = new Individual("Зоя", 15500);
        Sponsor sponsor3 = new Company("IBG", 300000);
        Sponsor sponsor4 = new Company("NFS", 420000);

        car1.getMechanics().add(mechanic1);
        car1.getMechanics().add(mechanic4);
        truck1.getMechanics().add(mechanic2);
        bus1.getSponsors().add(sponsor1);
        bus1.getSponsors().add(sponsor2);
        bus1.getSponsors().add(sponsor2);
        bus1.getSponsors().add(sponsor2);
        bus1.getSponsors().add(sponsor2);


        mechanic1.doDiagnostic(car1);
        mechanic1.repairTransport();

        Transport.showInfo();

        // ============================================================================= //

        ServiceStation.addAutoToQueue(car1);
        ServiceStation.addAutoToQueue(car2);
        ServiceStation.addAutoToQueue(truck1);
        ServiceStation.addAutoToQueue(truck2);
        ServiceStation.addAutoToQueue(bus1);
        ServiceStation.addAutoToQueue(bus2);

        ServiceStation.doService(car1);
        ServiceStation.doService(bus1);

    }


}

