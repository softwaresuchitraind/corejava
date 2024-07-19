package com.sukla.java8;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class M2 {
    public static void main(String[] args) {
        Set<Integer> list1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> list2 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));

        // Find common elements
        Set<Integer> commonElements = list1.stream()
                                           .filter(list2::contains)
                                           .collect(Collectors.toSet());
        System.out.println("Common elements: " + commonElements);

        // Find the union
        Set<Integer> union = new HashSet<>(list1);
        union.addAll(list2);
        System.out.println("Union: " + union);
    }
}
