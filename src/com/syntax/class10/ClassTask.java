package com.syntax.class10;

public class ClassTask {

	public static void main(String[] args) {
		//find largest element from an array
		int[] nums= {200,30,-1,900,56,787,1000};
		int largest=nums[0];
		for(int i=0; i<nums.length; i++) {
			if(nums[i]>largest) {
				largest=nums[i];
			}
		}
System.out.println("The largest number is = "+largest);
	}

}