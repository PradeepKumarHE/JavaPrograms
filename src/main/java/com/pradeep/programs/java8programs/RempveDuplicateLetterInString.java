package com.pradeep.programs.java8programs;

import java.util.stream.Collectors;


public class RempveDuplicateLetterInString {
  public static void main(String args[]) {
    String str="pradeep";
    str.chars().mapToObj(obj -> (char) obj).collect(Collectors.toSet()).forEach(System.out::print);
    /* java 7*/
	  String output="";
	  char [] chars=str.toCharArray();
	  for(char ch:chars){
	     if(!output.contains(String.valueOf(ch))){
		     output=output+ch;
	     }
	  }
	  System.out.println(output);
  }
}
