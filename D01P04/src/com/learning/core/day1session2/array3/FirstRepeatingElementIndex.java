package com.learning.core.day1session2.array3;

import java.util.HashSet;

public class FirstRepeatingElementIndex {

    public static int findFirstRepeatingIndex(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int minIndex = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (set.contains(arr[i])) {
                minIndex = i;
            } else {
                set.add(arr[i]);
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        int index = findFirstRepeatingIndex(arr);
        if (index != -1) {
            System.out.println("The index of the first repeating element is: " + index);
            System.out.println("The first repeating element is: " + arr[index]);
        } else {
            System.out.println("No repeating elements found in the array.");
        }
    }
}
