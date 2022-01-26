package nullobject;

public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name) {
        for (String s : names) {
            if (name.equalsIgnoreCase(s)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
