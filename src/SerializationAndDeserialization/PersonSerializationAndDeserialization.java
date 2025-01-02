package SerializationAndDeserialization;

import java.io.*;

public class PersonSerializationAndDeserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String fileName = "file1.txt";
        Person p1 = new Person("Abhishek", 28, "1234567890");

        //serialization
        FileOutputStream file1 = new FileOutputStream(fileName);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(file1);
        objectOutputStream.writeObject(p1);

        //deserialization
        FileInputStream fileInputStream = new FileInputStream(fileName);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        System.out.println("The file contents are:" + objectInputStream.readObject());
    }
}
