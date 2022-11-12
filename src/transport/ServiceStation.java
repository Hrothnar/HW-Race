package transport;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class ServiceStation {
    private static Set<Transport> queue = new HashSet<>();

    public static void addAutoToQueue(Transport transport) {
        if (!(transport instanceof Bus))
            queue.add(transport);
    }

    public static void doService(Transport transport) {
        if (!(transport instanceof Bus)) {
            queue.remove(transport);
            System.out.println(transport.getBrand() + " " + transport.getModel() + " тех обслуживание пройдено");
        }
    }


}
