package com.company;

    public enum Calendar {
        WORKDAYS, HAPPYDAYS;

        public void workDayMessage(){
            System.out.println("Капец. Опять на работу.");
        }

        public void happyDayMessage(){
            System.out.println("Сегодня выходной");
        }
}
