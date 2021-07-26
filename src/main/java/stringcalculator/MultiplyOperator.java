package stringcalculator;

public class MultiplyOperator implements Operator {
    private static final String SYMBOL = "*";
    private static final MultiplyOperator INSTANCE = new MultiplyOperator();

    private MultiplyOperator() {}

    public static Operator getInstance() {
        return INSTANCE;
    }
    @Override
    public int calculate(int x, int y) {
        return x * y;
    }

    @Override
    public boolean match(String symbol) {
        return MultiplyOperator.SYMBOL.equals(symbol);
    }
}
