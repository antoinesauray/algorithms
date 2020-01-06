package net.sauray.algorithms;

import java.util.*;

class InsertionSort {


		public static int[] sort(int[] nums) {
				for(int i=1; i < nums.length; i++) {
						int prev = nums[i-1];
						int current = nums[i];
						int j=i;
						while(prev > current) {

								// swap current and prev
								nums[j-1] = current;
								nums[j] = prev;

								j--;
								prev=nums[j-1];
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
