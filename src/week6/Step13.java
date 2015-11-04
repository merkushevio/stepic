package week6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* Напишите программу, читающую из System.in текст в кодировке UTF-8, подсчитывающую в нем частоту появления слов,
* и в конце выводящую 10 наиболее часто встречающихся слов.

Словом будем считать любую непрерывную последовательность символов, состоящую только из букв и цифр. Например,
в строке "Мама мыла раму 33 раза!" ровно пять слов: "Мама", "мыла", "раму", "33" и "раза".

Подсчет слов должен выполняться без учета регистра, т.е. "МАМА", "мама" и "Мама" — это одно и то же слово.
Выводите слова в нижнем регистре.

Если в тексте меньше 10 уникальных слов, то выводите сколько есть.

Если в тексте некоторые слова имеют одинаковую частоту, т.е. их нельзя однозначно упорядочить только по частоте,
то дополнительно упорядочите слова с одинаковой частотой в лексикографическом порядке.

Задача имеет красивое решение через стримы без циклов и условных операторов. Попробуйте придумать его.

Sample Input 1:
Мама мыла-мыла-мыла раму!
Sample Output 1:
мыла
мама
раму

Sample Input 2:
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at faucibus.
Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur.
Vestibulum eget metus imperdiet sapien laoreet faucibus. Nunc eget vehicula mauris, ac auctor lorem.
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer vel odio nec mi tempor dignissim.
Sample Output 2:
consectetur
faucibus
ipsum
lorem
adipiscing
amet
dolor
eget
elit
mis
* */
public class Step13 {
    public static void main(String[] args) {
        try {
            //InputStreamReader read = new InputStreamReader(System.in, "UTF-8");
            //Stream<String> stream = new BufferedReader(read).lines();
            ArrayList<String> str = new ArrayList<>();
            str.add("Мама мыла-мыла-мыла раму!");
            TreeMap<String, Integer> map = new TreeMap<>();
            Stream<String> stringStream = str.stream();
            int[] count = {1};
            List<String> arrayList = new ArrayList<>();
            stringStream
                    .flatMap(s -> Stream.of(s.split("\\s|-")))
                    .map(s1 -> s1.toLowerCase())
                    .map(s2 -> s2.replaceAll("[!?:;,.]", ""))
                    .sorted()
                    .map(s4 -> map.containsKey(s4) ? map.replace(s4, map.get(s4) + 1) : map.put(s4, count[0]))
                    .count();
            arrayList = map.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue())
                    .map(stringIntegerEntry -> stringIntegerEntry.getKey())
                    .limit(10)
                    .collect(Collectors.toList());
            for (int i = arrayList.size() - 1; i >= 0 ; i--) {
                System.out.println(arrayList.get(i));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
