package net.sauray.algorithms;

import java.util.*;

class BubbleSort {


		public static int[] sort(int[] nums) {
				boolean swapped = true; 
				while(swapped == true) {
						swapped = false;
						for(int i=0; i<nums.length-1; i++) {
								int prev = nums[i];
								int next = nums[i+1];
								if(prev > next) {
										nums[i] = next;
										nums[i+1] = prev;
										swapped = true;
								}
						}
				}
				return nums;
		}

		public static void main( String[] args )
    {
				int[] sorted = sort(new int[] { 1, 8, 4, 6, 2, 13, 7 });
				for(int i=0; i < sorted.length; i++) {
						System.out.print(sorted[i]);
						System.out.print(" ");
				}
    }
}
