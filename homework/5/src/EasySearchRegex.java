import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EasySearchRegex implements ISearchEngine {

    @Override
    public int search(ArrayList<String> arrayStrings, String word) {

        int count = 0;

        for (String s : arrayStrings) {
            Pattern pattern = Pattern.compile("^" + word +"$");
            /*Такое выражение позволяет находить именно строгие вхождения,
             если передавать просто word, то будет включать слова типа "Двойная"*/

            Matcher matcher = pattern.matcher(s);
            if (matcher.find()){
                count++;
            }
        }
        return count;
    }
}
