package strategy;

/**
 * In Strategy pattern, a class behavior or its algorithm can be changed at run time.
 * This type of design pattern comes under behavior pattern.
 *
 * In Strategy pattern, we create objects which represent various strategies and a context object
 * whose behavior varies as per its strategy object.
 * The strategy object changes the executing algorithm of the context object.
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 10;
        Context context = new Context(new AddStrategy());
        System.out.println("Strategy Add: " + context.doExecution(num1, num2));
        context = new Context(new SubstractStrategy());
        System.out.println("Strategy Substract: " + context.doExecution(num1, num2));
        context = new Context(new MultiplyStrategy());
        System.out.println("Strategy Multiply: " + context.doExecution(num1, num2));
    }
}
