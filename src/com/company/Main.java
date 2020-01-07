package com.company;

public class Main {
    public static void main(String[] args) {
        EnumWorkDays days;
        DayResolver dayResolver = new DayResolver();

        System.out.println(" Какой сегоня день недели? \n In English please!");

        String day = dayResolver.getDay();
        dayResolver.setDay(day);
        dayResolver.calendar(day);

        //days.showAllDays();
    }
}
