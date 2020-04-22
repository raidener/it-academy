import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 3;
        String string="";
        int number = 0;

        while (true){
            if (count<1){
                System.out.println("Ваши попытки закончились");
                break;
            }
            System.out.println("Введите число от 1 до 10. Количество оставшихся попыток: " + count);
             string = reader.readLine();
            try {
                 number = Integer.parseInt(string);
            } catch (Exception e){
                System.out.println("Вы ввели не число, повторите попытку.");
                count--;
                continue;
            }
            if ( number<1 || number > 10){
                String s = "Введенное число не входит в интервал от 1 до 10";
                try {
                    throw new Exception(s);
                } catch (Exception e) {
                    System.out.println(s);
                    count--;
                    continue;
                }
            }
            System.out.println("Вы ввели число:" + number);
            break;
        }
    }
}
