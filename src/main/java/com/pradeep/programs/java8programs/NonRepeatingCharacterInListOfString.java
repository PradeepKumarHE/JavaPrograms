package com.pradeeplearning.ws.products;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NonRepeatingCharacterInListOfString {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<String>();
        list1.add("Stress");
        list1.add("Stress");
        list1.add("apple");

        List t=list1.stream()
                .map(word -> word.chars()
                        .mapToObj(c -> Character.toLowerCase((char) c))
                        .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                        .entrySet().stream()
                        .filter(entry -> entry.getValue() == 1)
                        .map(Map.Entry::getKey)
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());
        System.out.println(t);
    }
}
