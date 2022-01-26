package frontcotroller;

public class Dispatcher {
    private final HomeView homeView;
    private final StudentView studentView;

    public Dispatcher() {
        homeView = new HomeView();
        studentView = new StudentView();
    }

    public void dispatch(Dispatchers dispatcher) {
        switch (dispatcher) {
            case Home:
                homeView.show();
                break;
            case Student:
                studentView.show();
                break;
        }
    }
}
