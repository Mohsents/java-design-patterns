package strategy;

public class Context {
    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int doExecution(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
