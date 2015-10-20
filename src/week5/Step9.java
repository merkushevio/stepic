package week5;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Step9 {
    public static void main(String[] args) throws IOException {
        byte[] bytes = {13, 13, 13, 13, 10, 13}; //"97,98,13,99,100", "97,98,10,99,100", "97,98,13,100", "97,13,10,10,98", "97,13,13,98",""};97,98,99,100
        InputStream input = new ByteArrayInputStream(bytes);
        exchange(input);
    }

    public static void exchange(InputStream input) throws IOException {
        OutputStream outputStream = System.out;
        int block;
        int next = 0;
        block = input.read();
        while (block >= 0) {
            if (block == 13) {
                if ((next = input.read()) == 10) {
                    System.out.println(next);
                    block = next;
                    next = 0;
                } else {
                    System.out.println(block);
                    block = next;

                }
            } else if (block != next) {
                System.out.println(block);
                block = input.read();
            } else {
                next = 0;
                block = input.read();
            }

        }


    }
}

