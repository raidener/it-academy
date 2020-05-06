import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReaderMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.bin"));

        List<Student> listOfStudents = new ArrayList<>();

        while (true) {
            try {
                listOfStudents.add((Student) ois.readObject());
            }
            catch (EOFException e) {
                break;
            }

        }

        ois.close();

        StudentsNameComparator comparator = new StudentsNameComparator();

        listOfStudents.sort(comparator);


        for (Student list : listOfStudents) {
            System.out.println(list);
        }



        File file = new File("SortedStudents.txt");
        PrintWriter printWriter = new PrintWriter(file);

        for (Student list : listOfStudents) {
            printWriter.println(list);
        }

        printWriter.close();

    }
}
