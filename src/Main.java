import java.util.Scanner; // before the class at top of the file

public class Main {
    public static void main(String[] args) {
        // Ask user for age
        // If age >= 21 → print wristband message
        // Else → say they do not get a wristband

        Scanner in = new Scanner(System.in);
        int age = 0;
        String trash = ""; // for bad input

        System.out.print("Enter your age: ");

        if (in.hasNextInt()) {
            // OK safe to read an int
            age = in.nextInt();
            in.nextLine(); // clear buffer

            if (age >= 21) {
                System.out.println("You get a paper wrist band.");
            } else {
                System.out.println("You do not get a wrist band.");
            }
        } else {
            // Not an int, read as String instead
            trash = in.nextLine();
            System.out.println("\nYou said your age was: " + trash);
            System.out.println("Run the program again and enter a valid integer!");
        }
    }
}