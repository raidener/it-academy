import java.util.Scanner;

public class Number7Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество элементов массива :");
        int n = scan.nextInt();
        int nums[]=new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.println("Введите "+(i+1)+" элемент массива :");
            nums[i] = scan.nextInt();
        }
        Sort.insertionSort(nums);
        System.out.println("Выведем отсортированный массив:");
        for (int i:nums){
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("Удаляем дубликаты из массива:");
        int count=1;
        for (int i = 0; i < n-1; i++) {
            if (nums[i+1]!=nums[i]){
                count++;
            }
        }

        for ( int i = 0, m = 0; i != n; i++, n = m )
        {
            for ( int j = m = i + 1; j != n; j++ )
            {
                if ( nums[j] != nums[i] )
                {
                    if ( m != j ) nums[m] = nums[j];
                    m++;
                }
            }
        }
        if ( n != nums.length )
        {
            int[] b = new int[n];
            for ( int i = 0; i < n; i++ ) b[i] = nums[i];

            nums = b;
        }
        for (int i: nums){
            System.out.print(i+" ");
        }
    }
}
