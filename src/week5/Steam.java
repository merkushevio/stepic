package week5;


import java.io.*;
import java.util.Scanner;


public class Steam {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double dob = 0;
        double res = 0;
        String str;
        while (scanner.hasNextLine()) {
            str = scanner.nextLine();
            Scanner mas = new Scanner(str);
            mas.useDelimiter(" ");
            while (mas.hasNext()) {
                if (mas.hasNextDouble()) {
                    dob = mas.nextDouble();
                    res += dob;
                } else mas.next();
            }
        }
        System.out.printf("%.6f", res);
    }
}
