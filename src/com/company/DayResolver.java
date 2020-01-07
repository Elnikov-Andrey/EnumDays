package com.company;
import java.util.Scanner;

public class DayResolver  {
    Scanner scanner = new Scanner(System.in);

    WorkDays workDaysList = new WorkDays();
    HappyDays happyDaysList = new HappyDays();

    public String getDay() {
        String day = scanner.nextLine();
        return day;
    }

    public void setDay(String day){
        System.out.println("Today is " + day);
    }

    public void calendar (String day){
        workDaysList.selectWorkDay(day);
        happyDaysList.selectHappyDay(day);
    }

}
