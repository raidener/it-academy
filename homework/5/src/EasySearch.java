import java.util.ArrayList;

public class EasySearch implements ISearchEngine {
    @Override
    public  int search(ArrayList<String> arrayStrings, String word) {

       int count = 0;

       for (int i = 0; i < arrayStrings.size(); i++) {
           if (arrayStrings.get(i).equals(word)){
               count++;
           }
        }

        return count;


    }
}
