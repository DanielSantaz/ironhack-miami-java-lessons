package com.ironhack.w1.tuesday;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Week 1 day 2 lessons");
//        ARRRAYS

        String[] daysOfTheWeek = new String[7];
        for (int i = 0; i < daysOfTheWeek.length; i ++){
            String day = "";
            switch (i){
                case 0:
                    day += "monday";
                    break;
                case 1:
                    day += "tuesday";
                    break;
                case 2:
                    day += "wendesday";
                    break;
                case 3:
                    day += "thursday";
                    break;
                case 4:
                    day += "friday";
                    break;
                case 5:
                    day += "saturday";
                    break;
                case 6:
                    day += "sunday";
                    break;
            }


            daysOfTheWeek[i] = day;
            day = "";
        }
        System.out.println(daysOfTheWeek);
        String arrayinfo = Arrays.toString(daysOfTheWeek);
        arrayinfo = arrayinfo.substring(1,arrayinfo.length()-1);
        arrayinfo = arrayinfo.replace(", ", "\n");
        System.out.println(arrayinfo);
    }




}
