package singleton;

class SingletonObject {
    // Create an object of SingleObject
    private static final SingletonObject instance = new SingletonObject();

    // Make the constructor private so that this class cannot be instantiated
    private SingletonObject(){}

    // Get the only object available
    public static SingletonObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
