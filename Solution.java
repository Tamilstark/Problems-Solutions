import java.util.Scanner;
public class Solution {
    public static int nextNum(int a, int b, int c, int N) {
        int count = 3;
        int sum = 0;
        while (count < N) {
            sum = a + b + c;
            a = b;
            b = c;
            c = sum;
            count++;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a, b, c, N;
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
        	a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            N = scanner.nextInt();
            System.out.println(nextNum(a, b, c, N));
        }
        scanner.close();
    }
}
