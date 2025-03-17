//Writing a file
import java.io.FileWriter;
import java.io.IOException;
public class hand {
    public static void main(String[]args){
        try {
            FileWriter java=new FileWriter("java.txt");//creating And wirting a file
            java.write("Class in Python\n" +
                    "Objects in Python\n" +
                    "Polymorphism in Python\n" +
                    "Encapsulation in Python\n" +
                    "Inheritance in Python\n" +
                    "Data Abstraction in Python");

            java.close();
            System.out.println("Java file creation and writing is finish");
        }catch (IOException e){
            System.out.println("File is not created:Error");
            e.printStackTrace();
        }
    }
}