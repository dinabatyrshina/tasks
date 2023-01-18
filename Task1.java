import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int n = input.nextInt();
        System.out.println("Введите длину интервала: ");
        int m = input.nextInt();
        int[] array = new int[n];
        Arrays.setAll(array, i -> ++i);
        int num = 0;
        System.out.print("Путь: ");
        do {
            System.out.print(array[num]);
            num = (num + m - 1) % n;
        } while (num != 0);
    }
    }

