package day17_practice_tasks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class InvertMap {

    public static void main(String[] args) {

        Map<Integer, Character> map = new HashMap<>();
        map.put(1, 'a');
        map.put(2, 'b');
        map.put(3, 'c');

        Map<Character, Integer> invertMap = new LinkedHashMap<>();

        System.out.println(map);

        for (Map.Entry<Integer, Character> integerCharacterEntry : map.entrySet()) {
            invertMap.put(integerCharacterEntry.getValue(), integerCharacterEntry.getKey());
        }

        System.out.println(invertMap);
    }

}

/*
2. Create a class named InvertMap and write a program that returns a new map which is the
inverted version of the provided map, meaning the keys become values and the values become keys.
It is assumed that there are no duplicate values in the original map.

         Example:
               map = {1="a", 2="b", 3="c"}

         Output:
               {"a"=1, "b"=2, "c"=3}
 */