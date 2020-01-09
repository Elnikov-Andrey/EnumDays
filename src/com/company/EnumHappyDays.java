package com.company;

public enum EnumHappyDays {
    SATURDAY, SUNDAY;


    public void showAllHappyDays(){
        EnumHappyDays[] days = EnumHappyDays.values();
        //for (EnumHappyDays s : days) { System.out.println(s); };
        for (int i=0; i<days.length; i++) {
            System.out.println(days[i]);
        }
    }

}
