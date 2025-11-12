import java.util.Scanner;

public class fibonon_recursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int num = sc.nextInt();

        if (num <= 0) {
            sc.close();
            return;
        }

        int a = 0, b = 1;
        for (int i = 0; i < num; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        sc.close();
    }
}
