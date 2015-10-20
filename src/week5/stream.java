package week5;


import java.io.IOException;
import java.io.InputStream;

public class stream {
    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int res = 0;
        while (inputStream.read() != -1){
             res += Integer.rotateLeft(res, 1)^inputStream.read();

        }
        return res;
    }

    public static void main(String[] args) {
        byte[] bytes = {0x33, 0x45, 0x01};


    }
}
