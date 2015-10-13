package test.week3;


import java.util.Arrays;
import java.lang.*;

public class AsciiCharSequence implements CharSequence{
    private final byte string[];

    public AsciiCharSequence() {
        this.string = "".getBytes();
    }

    public AsciiCharSequence(byte[] string) {
        this.string = Arrays.copyOf(string, string.length);

    }

    @Override
    public int length() {
        return string.length;
    }

    @Override
    public char charAt(int index) {
        if ((index < 0) || (index >= string.length)) {
            throw new StringIndexOutOfBoundsException(index);
        }
        return (char)string[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0) {
            throw new StringIndexOutOfBoundsException(start);
        }
        if (end > string.length) {
            throw new StringIndexOutOfBoundsException(end);
        }
        int subLen = end - start;
        if (subLen < 0) {
            throw new StringIndexOutOfBoundsException(subLen);
        }
        return ((start == 0) && (end == string.length)) ? this
                : new String(string, start, subLen);
    }

    @Override
    public String toString() {
        char[] chars = new char[string.length];
        for (int i = 0; i < string.length; i++) {
            chars[i] = string[i];
        }
        return chars.toString();
    }
}
