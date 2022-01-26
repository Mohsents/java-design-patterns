package command;

import java.util.ArrayList;
import java.util.Arrays;

public class Broker {
    private final ArrayList<Order> orderList = new ArrayList<>();

    public void takeOrder(Order... order) {
        orderList.addAll(Arrays.asList(order));
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
