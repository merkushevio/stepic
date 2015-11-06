package algorithms.week1.fibo;

/*
    Даны целые числа 1≤n≤1018 и 2≤m≤105, необходимо найти остаток от деления n-го числа Фибоначчи на m.
    Sample Input:
    28167953910475289 602
    Sample Output:
    335
*
* Решение на базе матриц, или другой алгоритм решения О(logN)
*
* */


import java.math.BigInteger;
import java.util.Scanner;

public class FiboStep8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        //int m = scanner.nextInt();
        int[][] mas = {{0, 1},{1, 1}};
        for (int i = 0; i < n/2; i++) {
            if (i % 1 != 1) {

            }
        }
        System.out.println();
    }


}
