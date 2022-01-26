package servicelocator;

public class InitialContext {
    public Service lookup(Services service) {
        switch (service) {
            case Service1:
                System.out.println("Looking up and creating a new Service1 object");
                return new Service1();
            case Service2:
                System.out.println("Looking up and creating a new Service2 object");
                return new Service2();
        }
        return null;
    }
}
