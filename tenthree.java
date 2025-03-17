import java.io.FileWriter;
import java.io.IOException;
class File_handling_createandwrite{
    public static void main(String args[]){
        try{
            FileWriter writer=new FileWriter("D:/JAVA OOP.txt");
            writer.write("JAVA OOP CONCEPT\nOOP java has 4 main parts they are\npolymorphism\nabstarction\ninheritance\nencapsulation");
            writer.close();
            System.out.println("Java OOP concept added successfully");
        }catch(IOException e){
            System.out.println("error occurred");
            e.printStackTrace();
        }
    }
}