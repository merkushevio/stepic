package algorithms.week1.fibo;

/*
* Дано целое число 1≤n≤40, необходимо вычислить n-е число Фибоначчи
* (напомним, что F0=0, F1=1 и Fn=Fn−1+Fn−2 при n≥2).
    Sample Input:
    3
    Sample Output:
    2
*
* */


import java.util.Scanner;

public class FiboStep6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] fibo = new int[41];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibo[i] = fibo[ i - 1 ] + fibo[i - 2];
        }
        System.out.println(fibo[n]);
    }


}
