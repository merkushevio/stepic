package week4;

/*���������� ����� sqrt(), ����������� ���������� ������ �����. � ������� �� Math.sqrt(), ��� ����� ��� ��������
        �������������� ��������� ������ ������� ���������� java.lang.IllegalArgumentException
        � ���������� "Expected non-negative number, got ?", ��� ������ ��������� ����� �����������
        ���������� ���������� � ����� �����.*/

public class main {

    public static double sqrt(double x) throws IllegalArgumentException{

        try {
            if(x >= 0){
            double res = Math.sqrt(x);
            return res;}
            else throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException e) {
            System.err.println("Expected non-negative number, got " + x);
        }
        return -1;
    }

    public static void main(String[] args) {
        double dot = -5;
        sqrt(dot);
    }
}
