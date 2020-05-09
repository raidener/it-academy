import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderMain {
    public static void main(String[] args)  {
        List<Student> listOfStudents = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.bin"));) {

            while (true) {
                try {
                    listOfStudents.add((Student) ois.readObject());
                }
                catch (EOFException e) {
                    break;
                }
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        listOfStudents.sort(new StudentsNameComparator());

        for (Student list : listOfStudents) {
            System.out.println(list);
        }


        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SortedStudentsFields.bin"))) {
            for (Student list : listOfStudents) {
                oos.writeUTF(list.getName());
                oos.writeInt(list.getAge());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        try ( BufferedWriter writer = new BufferedWriter(new FileWriter("SortedStudents.txt"));) {
            for (Student list : listOfStudents) {
                writer.append(list.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
