import java.io.FileWriter;
import java.io.FileReader; // Added this import for FileReader
import java.io.BufferedReader;
import java.io.IOException;

class File_handling_car_reading_example {
    public static void main(String args[]) {
        // Writing to the file
        try {
            FileWriter writer = new FileWriter("D:/CAR DETAILS.txt");
            writer.write("CAR1 DETAILS\n-----------\ncarname:brezza\ncar color:blue\ncar number plate:kl55u454\ncar country:india\ncar price:1200000\nCAR2 DETAILS\n-----------\ncarname:crysta\ncar color:black\ncar number plate:kl34y3456\ncar country:india\ncar price:1340000");
            writer.close();
            System.out.println("Java OOP concept added successfully");
        } catch (IOException e) {
            System.out.println("Error occurred");
            e.printStackTrace();
        }

        // Reading from the file
        try {
            FileReader reader = new FileReader("D:/CAR DETAILS.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String java;
            while ((java = bufferedReader.readLine()) != null) {
                System.out.println(java);
            }
            bufferedReader.close();
            reader.close();
        } catch (IOException e) {
            System.out.println("Error occurred");
            e.printStackTrace();
        }
    }
}
