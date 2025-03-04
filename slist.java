import java.util.ArrayList;
import java.util.Scanner;

public class slist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of animals:");

        int n = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> animals = new ArrayList<>();

        System.out.println("Enter the names of the animals:");
        for (int i = 0; i < n; i++) {
            String animal = scanner.nextLine();
            animals.add(animal);
        }

        System.out.println("The list of animals you entered:");
        for (String animal : animals) {
            System.out.println(animal);
        }

        scanner.close();
    }
}
