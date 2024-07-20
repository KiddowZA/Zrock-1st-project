import java.util.Scanner;

public class CreateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        System.out.println("Enter 5 elements for the array:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("The elements of the array are:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
