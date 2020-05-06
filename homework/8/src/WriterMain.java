import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriterMain {
    public static void main(String[] args) throws IOException {

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.bin"));

        for (int i = 0; i < 100_000; i++) {
            oos.writeObject(new Student(StudentNameAndAgeGenerator.nameGenerator(), StudentNameAndAgeGenerator.ageGenerator()));
        }

        oos.close();

    }

}
