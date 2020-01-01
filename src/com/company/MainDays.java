package com.company;

public enum MainDays {
    WORKDAYS, HAPPYDAYS;

    public void workDayMessage(String workDay){
        System.out.println("Капец. Сегодня " + workDay + " Опять на работу.");
    }

    public void happyDayMessage(String happyDay){
        System.out.println("Сегодня выходной");
    }

}
