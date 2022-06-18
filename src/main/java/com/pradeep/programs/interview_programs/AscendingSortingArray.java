package com.pradeep.programs.interview_programs;

public class AscendingSortingArray {

	public static void main(String[] args) {
		int [] arr 	= {2,4,6,1,9,8,3,6};
		int temp;
		for (int i = 0; i < arr.length; ++i) {
			for (int j = i+1; j < arr.length; ++j) {
				if (arr[i] > arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
