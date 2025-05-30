package com.pradeep.programs.java14More;

public class InstanceOfPatternMatching {
    public static void main(String[] args) {
        Object object=(Object) "Hello world !!!";
        if (object instanceof String){
            String s=(String) object;
            System.out.println(s);
        }
        if (object instanceof String s){
            System.out.println(s);
        }
    }
}
