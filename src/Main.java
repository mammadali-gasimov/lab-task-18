import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) {
        // Task - 1
        Scanner scanner = new Scanner(System.in);
        String reversed = reverseString(scanner.nextLine());
        System.out.println("Reversed ==>> " + reversed);

        // Task - 2
        splitText("a:b:c:d:e");
        System.out.println();

        // Task -3
        printLetters("a b,c.d/e");
    }

    public static String reverseString(String input) {
        String reversed = "";
        String lower = input.toLowerCase();
        for (int i = input.length() - 2; i >= 0; i--) {
            reversed += lower.charAt(i);
        }
        return Character.toUpperCase(input.charAt(input.length() - 1)) + reversed;
    }

    public static void splitText(String text) {
        String[] letters = text.split(":");
        for (String letter : letters) {
            System.out.print(letter + " ");
        }
    }

    public static void printLetters(String text) {
        char[] chars = text.toCharArray();
        for (char letter : chars) {
            if (Character.isLetter(letter)) {
                System.out.print(letter + " ");
            }
        }
    }
}