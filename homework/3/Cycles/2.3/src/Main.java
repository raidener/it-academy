import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long result=1;
        System.out.println("Введите число :");
        Scanner scan = new Scanner(System.in);
        long number = scan.nextLong();
        long number1=number;
        System.out.println("Идет перемножение всех цифр числа " + number1 + " :");
        while (number!=0){
            result*= number % 10;
            number/= 10;
            System.out.println("В данный момент произведение равно = "+ result);
        }
        System.out.println("Результат : "+result);
    }
}
