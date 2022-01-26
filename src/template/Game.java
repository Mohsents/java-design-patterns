package template;

public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    // Template method
    public void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
