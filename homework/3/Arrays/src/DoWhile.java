
import java.util.Scanner;

public class DoWhile {
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
        int j=0;
        do {
            System.out.println((j+1)+" элемент массива имеет значение : "+nums[j]);
            j++;
        }
        while (j<n);
        System.out.println("Теперь выведем каждый второй элемент массива в одну строку");
        j=0;
        do {
            System.out.print(nums[j]+" ");
            j=j+2;
        }
        while (j<n);
    }
}

