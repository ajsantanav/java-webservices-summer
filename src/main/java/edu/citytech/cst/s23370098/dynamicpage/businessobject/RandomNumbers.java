package edu.citytech.cst.s23370098.dynamicpage.businessobject;

import java.util.Random;

public class RandomNumbers {

    public static float getRandomNumbers(int start, int end) {
        Random r = new Random();
        float number = r.nextInt(end-start) + start;
        number = number + getCents();
        return number ;
    }

    public static float getCents() {
        Random r = new Random();
        float number = r.nextInt(100-0) + 0;
        return number / 100 ;
    }
}
