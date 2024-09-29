package lc;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {
	
	public int[] twosum(int[] nums, int target) {
		
		List<Integer> ls = new ArrayList<>();
		int[] result = null;
		
		for(int i=0; i<nums.length; i++) {
			
			for(int j=i+1; j<nums.length; j++) {
				
				if(nums[i]+nums[j] == target) {
					
					return result = new int[] {i,j};
				}
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		TwoSum obj = new TwoSum();
		int[] arr = {2,7,11,15};
		int[] arr1 = {2,3,4};
		System.out.println(obj.twosum(arr, 9).length);
		
		System.out.println(obj.twosum(arr1, 9).length);
	}

}
