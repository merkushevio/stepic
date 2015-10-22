package week6;


import java.util.LinkedHashSet;
import java.util.Set;


public class Collect {
    public static void main(String[] args) {

    }
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> result = new LinkedHashSet<>();
        for (T t : set1) {
            if (!set2.contains(t)) {
                result.add(t);
            }
        }
        for (T t1 : set2) {
            if (!set1.contains(t1)) {
                result.add(t1);
            }
        }
        return result;
    }

}
