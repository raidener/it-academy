import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String filePath = "./Война и мир.txt";
        String strings = ReadAllBytes.readAllBytesJava7(filePath);
        String[] strings1 = strings.split("\\s|\\b");
        ArrayList<String> arrayStrings = new ArrayList<>();
        for (int i = 0; i < strings1.length; i++) {
            arrayStrings.add(strings1[i]);
        }

        EasySearch easySearch = new EasySearch();

        System.out.println(easySearch.search(arrayStrings,"война"));
        System.out.println(easySearch.search(arrayStrings,"Война"));
        System.out.println(easySearch.search(arrayStrings,"Мир"));
        System.out.println(easySearch.search(arrayStrings,"мир"));
        System.out.println(easySearch.search(arrayStrings,"и"));

    }
}
