import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {

    public static List<String> reader(String filePatch){

        List<String> listOfURL = new ArrayList<>();

        try (BufferedReader in = new BufferedReader(new FileReader(filePatch))){
            while (true){
                String line = in.readLine();
                if(line != null){
                    listOfURL.add(line);
                } else {
                    break;
                }
            }
        } catch (IOException e){
            System.out.println("Произошла ошибка " + e.getMessage());
        }

        return listOfURL;
    }

}
