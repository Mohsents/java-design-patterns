package frontcotroller;

public class FrontController {
    private final Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser(){
        System.out.println("User is authenticated successfully.");
        return true;
    }

    private void trackRequest(Dispatchers request){
        System.out.println("Page requested: " + request.name());
    }

    public void dispatchRequest(Dispatchers request) {
        // Log each request
        trackRequest(request);

        // Authenticate the user
        if (isAuthenticUser()) {
            dispatcher.dispatch(request);
        }
    }
}
