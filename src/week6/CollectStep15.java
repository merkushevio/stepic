package week6;



/*
*Напишите программу, которая прочитает из System.in последовательность целых чисел, разделенных пробелами, затем удалит из них все числа, стоящие на четных позициях, и затем выведет получившуюся последовательность в обратном порядке в System.out.

Все числа влезают в int. Позиции чисел в последовательности нумеруются с нуля.

В этом задании надо написать программу целиком, включая import'ы, декларацию класса Main и метода main.

Sample Input:
1 2 3 4 5 6 7
Sample Output:
6 4 2
*
**/

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CollectStep15 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (scanner.hasNextInt()){
            if (n % 2 != 0){
            arrayList.add(scanner.nextInt());
            }
            else scanner.next();
            n++;
        }

        for (int i = arrayList.size() - 1; i >= 0 ; i-- ) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}
