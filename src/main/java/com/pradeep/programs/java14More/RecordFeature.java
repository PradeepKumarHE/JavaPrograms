package com.pradeep.programs.java14More;

public class RecordFeature {
    record UserRecord(String name,int age){
        static String email="pradeepkuamrhe1989@gmail.com";
    }
    public static void main(String[] args) {
        UserRecord record=new UserRecord("Pradeep",36);
        System.out.println(record.name);
        UserRecord.email="Pramod";
        System.out.println(UserRecord.email);
    }
}
