public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculator = new CalculatorWithOperator();
        double c=calculator.division(28,5);
        c=calculator.power(c,2);
        double d=calculator.multiplication(15,7);
        d=calculator.addition(4.1,d);
        d=calculator.addition(c,d);
        System.out.println(d);
    }
}
