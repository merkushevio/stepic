package week5;


import java.io.*;
import java.nio.charset.Charset;

public class Step12 {
    public static void main(String[] args) throws IOException {
        byte[] bytes = {48, 49, 50, 51};
        InputStream inputStream = new ByteArrayInputStream(bytes);
        String sout = readAsString(inputStream, Charset.forName("ASCII"));
        System.out.println(sout);
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        Reader reader = new InputStreamReader(inputStream, charset);
        String str = "";
        int i;
        while ( (i = reader.read()) != -1)
        {
                str += (char)i;
        }
        return str;
    }
}
