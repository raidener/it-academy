public class CalculatorWithMath implements ICalculator {
    @Override
    public double addition(double a, double b) {
        return a+b;
    }

    @Override
    public double subtraction(double a, double b) {
        return a-b;
    }

    @Override
    public double multiplication(double a, double b) {
        return a*b;
    }

    @Override
    public double division(double a, double b) {
        return a/b;
    }

    @Override
    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    @Override
    public double absoluteValue(double a) {
        return Math.abs(a);
    }

    @Override
    public double squareRoot(double a) {
        return Math.sqrt(a);
    }
}
