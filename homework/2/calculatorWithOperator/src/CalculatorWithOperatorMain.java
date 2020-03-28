import java.math.BigDecimal;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculator = new CalculatorWithOperator();
        double c=calculator.division(28,5);
        c=calculator.power(c,2);
        double d=calculator.multiplication(15,7);
        d=calculator.addition(4.1,d);
        d=calculator.addition(c,d);
        System.out.println(d);
        System.out.println(d/0);// 2.1 Результат: Infinity
        System.out.println(d/0.0d);// 2.2 Результат: Infinity

        //2.6 Считаем тот же пример при прмощи CalculatorWithMath
        CalculatorWithMath calcMath = new CalculatorWithMath();
        c = calcMath.division(28,5);
        c = calcMath.power(c,2);
        d = calcMath.multiplication(15,7);
        d = calcMath.addition(4.1,d);
        d = calcMath.addition(c,d);
        System.out.println(d);




    }
}
