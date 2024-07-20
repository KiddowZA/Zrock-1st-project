import java.util.Scanner;

public class ConcatenateStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String string1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String string2 = scanner.nextLine();

        String concatenatedString = string1 + string2;

        System.out.println("The concatenated string is: " + concatenatedString);
    }
}
