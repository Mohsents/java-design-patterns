package nullobject;

public class RealCustomer extends AbstractCustomer {
    
    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    boolean isNull() {
        return false;
    }

    @Override
    String getName() {
        return name;
    }
}
