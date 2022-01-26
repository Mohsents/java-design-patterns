package nullobject;

public class NullCustomer extends AbstractCustomer{
    @Override
    boolean isNull() {
        return true;
    }

    @Override
    String getName() {
        return "Not Available in Customer Database";
    }
}
