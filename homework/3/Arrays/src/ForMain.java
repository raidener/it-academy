
import java.util.Scanner;

public class ForMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество элементов массива :");
        int n = scan.nextInt();
        int nums[]=new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.println("Введите "+(i+1)+" элемент массива :");
            nums[i] = scan.nextInt();
        }
        System.out.println("Массив состоит из "+n+" элементов:");
        for (int i = 0; i < n; i++) {

            System.out.println((i+1)+" элемент массива имеет значение : "+nums[i]);
        }
        System.out.println("Теперь выведем каждый второй элемент массива в одну строку");
        for (int i = 0; i < n; i=i+2) {
            System.out.print(nums[i]+" ");
        }
    }
}
