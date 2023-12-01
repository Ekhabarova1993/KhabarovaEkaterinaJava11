import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Введите поочередно числа массива: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Числа кратные трем: ");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 3 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
