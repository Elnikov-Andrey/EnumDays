package com.company;

public enum EnumWorkDays {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY;


    public void showAllWorkDays(){
        EnumWorkDays[] days = EnumWorkDays.values();
        //for (EnumWorkDays s : days) { System.out.println(s); };
        for (int i=0; i<days.length; i++) {
            System.out.println(days[i]);
        }
    }

}
