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
        pseudoRandomStream(13);
    }

    public static IntStream pseudoRandomStream(int seed) {
        IntStream.generate(new GenerateInt(seed))
                .limit(9)
                .forEach(System.out::print);
        return null;
    }

    private static class GenerateInt implements IntSupplier {

        private int next;

        public GenerateInt(int input) {
            next = input;
        }

        @Override
        public int getAsInt() {
            int current = next;
            next = mid(current * current);
            return current;
        }
    }

    private static int mid(int in) {
        String str = String.valueOf(in);
        for (int i = 0; i < ; i++) {
            
        }

    }

}
