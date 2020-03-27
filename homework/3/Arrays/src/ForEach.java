
import java.util.Scanner;

public class ForEach {
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
        for (int j: nums) {
            System.out.print(j+" ");
        }
    }
}