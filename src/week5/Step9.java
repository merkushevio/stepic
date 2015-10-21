package week5;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class Step9 {
    public static void main(String[] args) throws IOException {
        byte[] bytes = {13, 13, 13, 13, 10, 13}; //"97,98,13,99,100", "97,98,10,99,100", "97,98,13,100", "97,13,10,10,98", "97,13,13,98",""};97,98,99,100
        InputStream input = new ByteArrayInputStream(bytes);
        exchange(input);
    }

    public static void exchange(InputStream input) throws IOException {
        OutputStream outputStream = System.out;
        int block;
        ArrayList<Byte> arrayList = new ArrayList<>();
        block = input.read();
        while (block >= 0) {
            arrayList.add((byte)block);
            block = input.read();
        }
        for (int i = 0; i < arrayList.size()-1; i++) {
            if (arrayList.get(i) == 13) {
                if (arrayList.get(i+1) == 10) {
                    arrayList.remove(i);
                }
            }
        }
        for (Byte aByte : arrayList) {
            outputStream.write((byte)aByte);
        }
        outputStream.flush();
    }
}


