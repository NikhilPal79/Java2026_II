package Java_Topics.SerializationAndDeserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentSerialDemo {
    static void main(String[] args) {

        Student student = new Student();
        student.rollNo = 1;
        student.name = "John";

        String fileName = "C:\\Users\\NIKHIL\\Desktop\\Test\\TestFile.txt";


        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName); /// FileOutputStream make file ready to in write mode
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);

            objectOutputStream.close();
            fileOutputStream.close();


        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Student has been saved to " + fileName);
        }

    }
}
