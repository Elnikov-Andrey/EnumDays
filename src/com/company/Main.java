package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        WorkDays workDays = WorkDays.MONDAY;
      //  workDays.workDayMessage();

        DayResolver dayResolver = new DayResolver();
        //WorkDays.MONDAY;
        dayResolver.hello("MONDAY");
        dayResolver.workDay = "MONDAY";

        Scanner in = new Scanner(System.in);
        System.out.println("Какой сегодня день недели?");
        String nameManager = in.nextLine();
        WorkDays.MONDAY.workDayMessage(nameManager);
    }
}
