import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        String greeting;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        greeting = scanner.nextLine();

        System.out.printf("Hello: %s" , greeting);
    }
}
