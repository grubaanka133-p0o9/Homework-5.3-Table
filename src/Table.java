import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        int[] table = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numbers:");

        table[0] = scanner.nextInt();
        table[1] = scanner.nextInt();
        table[2] = scanner.nextInt();
        table[3] = scanner.nextInt();
        table[4] = scanner.nextInt();

        System.out.println("Sum of 1 ,3 and 5 number is:" + (table[0] + table[2] + table[4]));
    }
}
