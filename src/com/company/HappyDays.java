package com.company;

    public class HappyDays{

        Calendar happyDays = Calendar.HAPPYDAYS;
        EnumHappyDays enumHappyDays = EnumHappyDays.SUNDAY;

        String[] happyDaysList = new String[]{"saturday","sunday"};

        public void selectHappyDay(String day){
            for (int i=0; i<happyDaysList.length; i++) {
                if (day.equals(happyDaysList[i])) {
                    happyDays.happyDayMessage();
                    System.out.println("Have a Good day!");
                }
            }

            enumHappyDays.showAllHappyDays();
        }

    }