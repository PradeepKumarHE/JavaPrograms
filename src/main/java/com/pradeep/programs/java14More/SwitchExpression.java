package com.pradeep.programs.java14More;

public class SwitchExpression {
    public static void main(String[] args) {
        System.out.println(dailyTask("MONDAY"));
    }
    public static String dailyTask(String day){
        String message= switch (day){
            case "MONDAY" -> {
                System.out.println("Hello world !!!");
                yield "A";
            }
            case "TUESDAY"-> "B";
            case "WEDNESDAY"-> "C";
            case "THURSDAY"-> "D";
            case "FRIDAY","SATURDAY","SUNDAY" -> "E";
            default -> "wrong input";
        };
        return message;
    }
}
