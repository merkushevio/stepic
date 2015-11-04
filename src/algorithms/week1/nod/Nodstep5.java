package algorithms.week1.nod;

import java.util.Scanner;

public class Nodstep5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        System.out.println(nod(first, second));
    }

    public static int nod(int a, int b) {

        if (a == 0) {
            return b;
        }
        else if (b == 0) {
            return a;
        }
        if (a >= b) {
            return nod(a % b, b);
        }
        else if (a <= b) {
            return nod(a, b % a);
        }
        return 0;
    }
}
