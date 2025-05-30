package com.pradeep.programs.java14More;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println(dailyTask("TUESDAY"));
    }
    public static String dailyTask(String day){
        String message=null;
        switch (day){
            case "MONDAY":message="A"; break;
            case "TUESDAY":message="B";
            case "WEDNESDAY":message="C"; break;
            case "THURSDAY":message="D"; break;
            case "FRIDAY":
            case "SATURDAY":
            case "SUNDAY":message="E"; break;
            default : message="wrong input"; break;
        }
        return message;
    }
}
