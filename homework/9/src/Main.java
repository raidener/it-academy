import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        /*Считываем URL из файла*/
        List<String> listOfURL = Reader.reader("Benign_list_big_final.csv");

        /*Регулярное выражение для поиска URL*/
        Pattern pattern = Pattern.compile("^(http|https)://(\\w+\\.([a-z]{2,6}))/*.*$");

        /*Создаем листы для протоколов, доменов, доменов верхнего уровня*/
        List<String> protokol = new ArrayList<>();
        List<String> domen = new ArrayList<>();
        List<String> updomen = new ArrayList<>();

        /*Проверяем URL на соответствие шаблону, добаляем в листы протоколы, домены, домены верхнего уровня*/
        for (String s : listOfURL) {
            Matcher matcher = pattern.matcher(s);
            if (matcher.matches()){
                protokol.add(matcher.group(1));
                domen.add(matcher.group(2));
                updomen.add(matcher.group(3));
            }
        }

        /*Заносим  в мапы количество встречающихся протоколов, доменов, домнов верхнего уровня*/
        Map<String, Integer> mapOfProtokol = MapCreateAndSort.createMap(protokol);
        Map<String, Integer> mapOfDomen = MapCreateAndSort.createMap(domen);
        Map<String, Integer> mapOfUpDomen = MapCreateAndSort.createMap(updomen);

        /*Сортируем мапы для получения топа*/
        Map<String, Integer> sortedmapOfProtokol = MapCreateAndSort.sortMap(mapOfProtokol);
        Map<String, Integer> sortedmapOfDomen = MapCreateAndSort.sortMap(mapOfDomen);
        Map<String, Integer> sortedmapOfUpDomen = MapCreateAndSort.sortMap(mapOfUpDomen);

        /*Выводим топ протоколов*/
        System.out.println("Топ протоколов :");
        for (Map.Entry<String, Integer> pair : sortedmapOfProtokol.entrySet())
        {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + ":" + value);
        }

        /*Выводим топ 10 доменов*/
        System.out.println("Топ 10 доменов :");
        for (Map.Entry<String, Integer> pair : sortedmapOfDomen.entrySet())
        {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + ":" + value);
        }

        /*Выводим топ 10 доменов верхнего уровня*/
        System.out.println("Топ 10 доменов верхнего уровня :");
        for (Map.Entry<String, Integer> pair : sortedmapOfUpDomen.entrySet())
        {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + ":" + value);
        }

    }
}
