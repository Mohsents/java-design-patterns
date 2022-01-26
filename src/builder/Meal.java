package builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private final List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float coast = 0.0f;
        for (Item item : items) {
            coast += item.price();
        }
        return coast;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println("Item: " + item.name());
            System.out.println("Packing: " + item.packing().pack());
            System.out.println("Price: " + item.price());
        }
    }
}
