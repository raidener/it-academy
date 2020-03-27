public class Main {
    public static void main(String[] args) {
        int nums1[] = {0,1,2,3,4,5,6,7,8,9};
        int nums2[] = {0,1,2,3,4,5,6,7,8,0};
        int nums3[] = {0,1,2,3,5,5,5,7,8,0};
        int nums4[] = {1,1,1,1,1,1,1,1,1,0};
        System.out.println("Вывод исхлдных массивов :");
        for(int i:nums1){
            System.out.print(i+" ");
        }
        System.out.println("");
        for(int i:nums2){
            System.out.print(i+" ");
        }
        System.out.println("");
        for(int i:nums3){
            System.out.print(i+" ");
        }
        System.out.println("");
        for(int i:nums4){
            System.out.print(i+" ");
        }
        System.out.println("");
        //Сортировка массивов
        Sort.bubbleSort(nums1);//Здесь можно проверить сортировки выбором,пузырьковую,шейкерную,вставками.
        Sort.bubbleSort(nums2);//
        Sort.bubbleSort(nums3);//
        Sort.bubbleSort(nums4);//
        //Вывод отсортированных массивов
        System.out.println("Вывод отсортированных массивов массивов :(Здесь можно проверить сортировки выбором,пузырьковую,шейкерную,вставками.)");
        for(int i:nums1){
            System.out.print(i+" ");
        }
        System.out.println("");
        for(int i:nums2){
            System.out.print(i+" ");
        }
        System.out.println("");
        for(int i:nums3){
            System.out.print(i+" ");
        }
        System.out.println("");
        for(int i:nums4){
            System.out.print(i+" ");
        }
        System.out.println("");

        int nums5[] = {0,1,2,3,4,5,6,7,8,9};
        int nums6[] = {0,1,2,3,4,5,6,7,8,0};
        int nums7[] = {0,1,2,3,5,5,5,7,8,0};
        int nums8[] = {1,1,1,1,1,1,1,1,1,0};
        System.out.println("Здесь можно проверить сортировку слиянием и сортировку разделением:");
        Sort.quickSort(nums5,0,nums5.length-1);
        Sort.quickSort(nums6,0,nums5.length-1);
        Sort.quickSort(nums7,0,nums5.length-1);
        Sort.quickSort(nums8,0,nums5.length-1);
        for(int i:nums5){
            System.out.print(i+" ");
        }
        System.out.println("");
        for(int i:nums6){
            System.out.print(i+" ");
        }
        System.out.println("");
        for(int i:nums7){
            System.out.print(i+" ");
        }
        System.out.println("");
        for(int i:nums8){
            System.out.print(i+" ");
        }
        System.out.println("");
    }
}
