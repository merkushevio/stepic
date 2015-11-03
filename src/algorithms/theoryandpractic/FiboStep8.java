package algorithms.theoryandpractic;

/*
    Даны целые числа 1≤n≤1018 и 2≤m≤105, необходимо найти остаток от деления n-го числа Фибоначчи на m.
    Sample Input:
    28167953910475289 602
    Sample Output:
    335
*
* */


import java.util.Scanner;

public class FiboStep8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long m = scanner.nextLong();
        long[] fibo = new long[n+1];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibo[i] = (fibo[i - 1] + fibo[i - 2]);
        }
        System.out.println(fibo[n]%m);
    }

}
