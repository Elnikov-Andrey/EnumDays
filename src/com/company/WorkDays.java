package com.company;

public class WorkDays {

    Calendar workDays = Calendar.WORKDAYS;
    EnumWorkDays enumWorkDays = EnumWorkDays.FRIDAY;

    String[] workDaysList = new String[]{
            "monday",
            "tuesday",
            "wednesday",
            "thursday",
            "friday"
    };

    public void selectWorkDay(String day) {
        for (int i = 0; i < workDaysList.length; i++) {
            if (day.equals(workDaysList[i])) {
                workDays.workDayMessage();
                System.out.println("Today is " + (i + 1) + " work day");
                System.out.println("Weekend will be soon!");

            }
        }

        enumWorkDays.showAllWorkDays();
    }

}