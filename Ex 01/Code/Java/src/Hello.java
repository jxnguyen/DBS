import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        // scanner to read input
        Scanner scanner = new Scanner(System.in);
        // prompt user for name
        System.out.print("Hey what's your name? ");
        // get input
        String name = scanner.next();
        // print message
        System.out.println("Hello " + name + "!");
    }
}
