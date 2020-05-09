import java.io.*;

public class WriterMain {
    public static void main(String[] args)  {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.bin"))) {
            for (int i = 0; i < 100_000; i++) {
                oos.writeObject(new Student(StudentNameAndAgeGenerator.nameGenerator(), StudentNameAndAgeGenerator.ageGenerator()));
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }

}
