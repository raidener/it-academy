import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите Ваше имя: ");
        String name = in.nextLine();
        String name1 = "Вася";
        String name2 = "Анастасия";
        String output1 = "Привет!";
        String output2 = "Я тебя так долго ждал";
        String output3 = "Добрый день, а вы кто?";
        if (name.equals(name1)){
            System.out.println(output1);
            System.out.println(output2);
        }
        else if (name.equals(name2)){
            System.out.println(output2);
        }
        else {
            System.out.println(output3);
        }
    }
}

