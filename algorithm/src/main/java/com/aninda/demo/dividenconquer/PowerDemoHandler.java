package com.aninda.demo.dividenconquer;

import com.aninda.dividenconquer.Power;

public class PowerDemoHandler {
    

    public static void powerDemo() {
        float x = 2.5f;
        int y = 2;
        System.out.println("base :: " + x + " power :: " + y);

        System.out.println("result :: " + Power.calc(x, y));
    }
}
