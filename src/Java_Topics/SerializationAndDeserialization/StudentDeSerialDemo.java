package Java_Topics.SerializationAndDeserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentDeSerialDemo {
    public static void main(String[] args) {

        String  fileName = "C:\\Users\\NIKHIL\\Desktop\\Test\\TestFile.txt";


        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);/// making file ready to read ready
            ObjectInputStream  objectInputStream = new ObjectInputStream(fileInputStream); /// reading object
            Student readObject = (Student) objectInputStream.readObject(); /// converting byte into object

            System.out.println(readObject.rollNo);
            System.out.println(readObject.name);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Student Object has been saved to " + fileName);
        }


    }
}
