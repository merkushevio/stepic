package algorithms.theoryandpractic;


import java.util.Scanner;

/*Дано число 1≤n≤107, необходимо найти последнюю цифру n-го числа Фибоначчи.

        Как мы помним, числа Фибоначчи растут очень быстро,
        поэтому при их вычислении нужно быть аккуратным с переполнением.
        В данной задаче, впрочем, этой проблемы можно избежать, поскольку нас интересует только
        последняя цифра числа Фибоначчи: если 0≤a,b≤9 — последние цифры чисел Fi и Fi+1 соответственно,
        то (a+b)mod10 — последняя цифра числа Fi+2.

        Sample Input:
        441832
        Sample Output:
        9
*/
public class FiboStep7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] fibo = new int[n+1];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibo[i] = (fibo[i - 1]%10 + fibo[i - 2]%10)%10;
        }
        System.out.println(fibo[n]);
    }

}
