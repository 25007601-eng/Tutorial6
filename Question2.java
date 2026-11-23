import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        displayDescending(a, b, c);

        input.close();
    }

    public static void displayDescending(int a, int b, int c) {
        int temp;

        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (a < c) {
            temp = a;
            a = c;
            c = temp;
        }

        if (b < c) {
            temp = b;
            b = c;
            c = temp;
        }

        System.out.println(a + " " + b + " " + c);
    }
}
