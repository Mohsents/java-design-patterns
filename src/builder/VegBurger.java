package builder;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Vwg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
