package net.sauray.algorithms;

import java.util.*;

class MergeSort {

    public static int[] mergeSorted(int[] first, int[] second) {
        int i1=0;
        int i2=0;
        int totalLength = first.length + second.length;
        int[] sorted = new int[totalLength];
        for(int i=0; i < totalLength; i++) {
            if(i2 >= second.length || (i1 < first.length && first[i1] < second[i2])) {
                sorted[i] = first[i1];
                i1++;
            } else {
                sorted[i] = second[i2];
                i2++;
            }
        }
        return sorted;
    }

    // O(n log n)
    public static int[] sort(int[] nums) {
        if(nums.length == 1) {
            return nums;
        }
        int[] first = Arrays.copyOfRange(nums, 0, nums.length / 2);
        int[] second = Arrays.copyOfRange(nums, nums.length / 2, nums.length);
        int[] s1 = sort(first);
        int [] s2 = sort(second);

        return mergeSorted(s1, s2);
    }

    public static void main( String[] args )
    {
        System.out.println("Hello World");
        int[] sorted = sort(new int[] { 1, 8, 4, 6, 2, 13, 7 });
        for(int i=0; i < sorted.length; i++) {
            System.out.print(sorted[i]);
            System.out.print(" ");
        }
    }
}
