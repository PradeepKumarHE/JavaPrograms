package com.pradeeplearning.ws.products;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AllNonRepeatingCharacterInString {
    public static void main(String[] args) {
        String input = "Stress";
        List<Character> result =input.chars()           // IntStream
                .mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i)))  // convert to lowercase & then to Character object Stream
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // store in a LinkedHashMap with the count
                .entrySet().stream()                       // EntrySet stream
                .filter(entry -> entry.getValue() == 1L)   // extracts characters with a count of 1
                .map(entry -> entry.getKey())              // get the keys of EntrySet
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
