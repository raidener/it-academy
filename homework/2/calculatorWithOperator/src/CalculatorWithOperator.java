public class CalculatorWithOperator {
    public double addition(double a, double b){
        double result=a+b;
        return result;
    }
    public double subtraction(double a, double b){
        double result=a-b;
        return result;
    }
    public double multiplication(double a, double b){
        double result=a*b;
        return result;
    }
    public double division(double a, double b) {
        double result = a / b;
        return result;
    }
    public double power(double a, double b) {
        double result = 1;
        for (int i=1; i<=b; i++){
            result *=a;
        }
        return result;
    }
    public double absoluteValue(double a){
        if (a<0){
            a=a*(-1);
            return a;
        }
        else return a;
    }
    public double squareRoot(double a){//Метод нахождения квадратного корня
        if (a==0){
            return 0;
        }
        else {
            double result = 1;
            for (int i = 1;i<=100; i++)
                result = (result + a / result) / 2;
            return result;
        }
    }
}
