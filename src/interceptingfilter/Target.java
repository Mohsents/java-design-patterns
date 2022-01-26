package interceptingfilter;

public class Target implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Executing request: " + request);
    }
}
