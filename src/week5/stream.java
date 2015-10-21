package week5;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class stream {
    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int res = 0;
        while (inputStream.read() != -1){
             res += Integer.rotateLeft(res, 1)^inputStream.read();

        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        byte[] bytes = {0x33, 0x45, 0x01};
        OutputStream outputStream = System.out;

        bytes = "Ы".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(Byte.toUnsignedInt(bytes[i]));
        }

    }
}
