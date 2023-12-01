import java.util.Scanner;

public class Main {
    public static void main (String[] ars) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scan.nextInt();
        if (number > 7) {
            System.out.println("Привет");
        }
    }
}
