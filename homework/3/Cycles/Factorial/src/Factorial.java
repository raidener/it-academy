import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Введите число :");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int result=1;
        for (int i = 1; i <= number; i++) {
            result=result*i;
        }
        System.out.println(result);
    }
}
