package algorithms.theoryandpractic;

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
        BigInteger n = scanner.nextBigInteger();
        int m = scanner.nextInt();
        BigInteger[] fibo = new BigInteger[];
        fibo[0] = BigInteger.ZERO;
        fibo[1] = BigInteger.ONE;

    }

}
