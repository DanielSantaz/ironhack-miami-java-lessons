package com.ironhack.w1.thursday;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
//BIG DECIMAL:

        System.out.println(1.2-1.0);

        BigDecimal bd1 = new BigDecimal("1.2");
        BigDecimal bd2 = new BigDecimal("1.0");

        System.out.println(bd1.subtract(bd2));




    }


}
