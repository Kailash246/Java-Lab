// Define the child (thread) class
class Runn extends Thread {
    // Override the run() method
    public void run() {
        int i = 1; // Initialize the variable outside the loop
        while (i < 5) { // Condition for the loop
            System.out.println("running....." + i);
            i++; // Increment the counter
            try {
                Thread.sleep(5000); // Pause for 5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Running_threadsusing_whileloop {
    public static void main(String[] args) {
        Runn obj = new Runn(); // Create an instance of the thread
        obj.start(); // Start the thread
    }
}
