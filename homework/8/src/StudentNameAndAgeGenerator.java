import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class StudentNameAndAgeGenerator {
    public static String nameGenerator() {
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        int nameLength = (1 + (int) (Math.random()*10));// Генерируем длину имени

        Random rand = new Random();

        StringBuilder nameBuilder = new StringBuilder();

        for (int i = 0; i < nameLength; i++) {
            nameBuilder.append(alphabet.get(rand.nextInt(alphabet.size())));
        }
        return nameBuilder.toString();
    }

    public static int ageGenerator() {
        Random rnd = new Random();

        return 17 + rnd.nextInt(53);
    }

}
