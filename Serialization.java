import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private String address;

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                ", address='" + this.address + '\'' +
                '}';
    }
}

public class Serialization {
    public static void main(String[] args) {
        Student student =  new Student("john", 25, "122 hej");

        String filename = "Test.txt";
        FileOutputStream fileOut = null;
        ObjectOutputStream objOut = null;

        //Serialization
        try {
            fileOut = new FileOutputStream(filename);
            objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(student);

            objOut.close();
            fileOut.close();

            System.out.println("Object has been serialized : \n" + student);

        } catch (IOException ex){
            System.out.println("IOException is caught");
        }

        //Deserialization
        FileInputStream fileIn = null;
        ObjectInputStream objIn = null;

        try {
            fileIn = new FileInputStream(filename);
            objIn = new ObjectInputStream(fileIn);

            Student object  = (Student) objIn.readObject();
            System.out.println("Object has been deserialized : \n" + object);

            objIn.close();
            fileIn.close();
        } catch (IOException e) {
            System.out.println("IOException is caught : \n" + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException is caught : \n" + e.getMessage());
        }
    }
}