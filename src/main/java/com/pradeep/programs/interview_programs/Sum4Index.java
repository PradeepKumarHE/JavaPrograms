package com.pradeep.programs.interview_programs;

public class Sum4Index {

	public static void main(String[] args) {
		
		int [] arr 	= {2,4,6,1,9,8,3,6};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==4) {
					System.out.println(i+" , "+j);
				}
			}	
		}

	}

}
