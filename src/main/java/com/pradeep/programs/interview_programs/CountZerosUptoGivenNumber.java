package com.pradeep.programs.interview_programs;

public class CountZerosUptoGivenNumber {
	public static void main(String[] args) {		
	    int num=45 , count=1;
      if(num==0){
        System.out.println("Count of zeros is :: "+count);
      }else{
        while(num / 10 != 0){
          count=count + num / 10;
          num = num / 10;
        }
      }  
     System.out.println("Count of zeros is :: "+count);
 }
}
