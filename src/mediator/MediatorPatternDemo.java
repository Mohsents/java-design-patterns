package mediator;

/**
 * Mediator pattern is used to reduce communication complexity between multiple objects or classes.
 * This pattern provides a mediator class which normally handles all the communications between different
 * classes and supports easy maintenance of the code by loose coupling.
 *
 * Mediator pattern falls under behavioral pattern category.
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User mohsen = new User("Mohsen");
        User abdullah = new User("Abdullah");

        mohsen.sendMessage("Hi");
        abdullah.sendMessage("Hi there");
    }
}
