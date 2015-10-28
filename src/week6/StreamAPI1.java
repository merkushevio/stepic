package week6;


/*
* Напишите метод, возвращающий стрим псевдослучайных целых чисел. Алгоритм генерации чисел следующий:

Берется какое-то начальное неотрицательное число (оно будет передаваться в ваш метод проверяющей системой).
Первый элемент последовательности устанавливается равным этому числу.
Следующие элементы вычисляются по рекуррентной формуле R от n+1 = mid(R от n в квадрате), где mid — это функция, выделяющая второй,
третий и четвертый разряд переданного числа. Например, mid(123456)=345.
Алгоритм, конечно, дурацкий и не выдерживающий никакой критики, но для практики работы со стримами сойдет :)

Пример

pseudoRandomStream(13) должен вернуть стрим, состоящий из следующих чисел:

13, 16, 25, 62, 384, 745, 502, 200, 0, ... (дальше бесконечное количество нулей)
* */



import java.util.function.IntSupplier;
import java.util.stream.IntStream;


public class StreamAPI1 {

    public static void main(String[] args) {
        IntStream(13)
    }

    public static IntStream pseudoRandomStream(int seed) {
        IntStream.generate(new GenerateInt())
                .limit(8)
                .forEach(System.out::print);



        return null;
    }
    private static class GenerateInt implements IntSupplier {

        private Integer prev;
        private Integer next;


        @Override
        public int getAsInt() {
            Integer current = next;
            next = mid(current * current);
            prev = current;
            return current;
        }
    }
    private static Integer mid(Integer in){
        String str = in.toString();
        char[] chars = str.toCharArray();
        str = "" + chars[1]+ chars[2] + chars[3];
        Integer out = Integer.parseInt(str);
        return out;
    }

}