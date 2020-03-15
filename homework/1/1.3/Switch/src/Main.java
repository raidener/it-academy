
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите Ваше имя: ");
        String name = in.nextLine();
        String output1 = "Привет!";
        String output2 = "Я тебя так долго ждал";
        String output3 = "Добрый день, а вы кто?";
        switch (name){
            case "Вася":
                System.out.println(output1);
                System.out.println(output2);
                break;
            case "Анастасия":
                System.out.println(output2);
                break;
            default:
                System.out.println(output3);
        }
    }
}
