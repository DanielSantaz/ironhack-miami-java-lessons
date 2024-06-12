package com.ironhack.w1.tuesday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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


        for (int i = 0; i < 7; i ++){
            System.out.println(i);


    }
        for (int i = 0; i < 101; i ++){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

//        ARRAY LIST:
        //will work better than arrays

        List<String> countries = new ArrayList<String>();
        countries.add("USA");
        countries.add("Spain");
        countries.add("France");
        System.out.println(countries);
        System.out.println(countries.get(0));

        countries.set(2, "Italy"); //changing a value in a list.

        Double d = 10d;
        Double e = 9d;
        Math.max(d,e);
        System.out.println(Math.ceil(3.01));




    }






}
