package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DayResolver dayResolver = new DayResolver();
        System.out.println("Какой сегоня день недели?");
        dayResolver.getDay();

        //System.out.println(x);

        /*MainDays workDays = MainDays.WORKDAYS;
        MainDays happyDays = MainDays.HAPPYDAYS;

        System.out.println("Какой сегоня день недели?");
        String day = scanner.nextLine();



        String workDay = new String();
        if (day == "monday") {
            workDay = day;
        }
        if (day == "sunday") {
            String happyDay = day;
        }

        //workDays.workDayMessage(day);
        //happyDays.happyDayMessage(day);

        /*DayResolver dayResolver = new DayResolver();
        //WorkDays.MONDAY;
        dayResolver.hello("MONDAY");
        dayResolver.workDay = "MONDAY";

        Scanner in = new Scanner(System.in);
        System.out.println("Какой сегодня день недели?");
        String nameManager = in.nextLine();
        WorkDays.MONDAY.workDayMessage(nameManager);*/
    }
}
