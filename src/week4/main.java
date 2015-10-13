package week4;

/*Реализуйте метод sqrt(), вычисляющий квадратный корень числа. В отличие от Math.sqrt(), это метод при передаче
        отрицательного параметра должен бросать исключение java.lang.IllegalArgumentException
        с сообщением "Expected non-negative number, got ?", где вместо вопросика будет подставлено
        фактически переданное в метод число.*/

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
