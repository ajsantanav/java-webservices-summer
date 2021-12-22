package edu.citytech.cst.s23370098.dynamicpage.businessobject;

import edu.citytech.cst.s23370098.dynamicpage.model.Numbers;

import java.util.ArrayList;
import java.util.List;

public class NumbersBO {

    public static List<Numbers> get123() {
        var list = new ArrayList<Numbers>();
        //############
        for (var num = 1; num <= 1000; num++) {
            list.add(new Numbers(num));
        }
        //#############
        return list;
    }

    public static List<Numbers> getTwo() {
        var list = new ArrayList<Numbers>();
        //############
        int index = 0;
        for (var num = 0; num <= 1000; num = num + 2) {
            list.add(new Numbers(num));
        }
        //#############
        return list;
    }

    public static List<Numbers> getThree() {
        var list = new ArrayList<Numbers>();
        //############
        int index = 0;
        for (var num = 0; num <= 1000; num = num + 3) {
            list.add(new Numbers(num));
        }
        //#############
        return list;
    }

    public static List<Numbers> getFour() {
        var list = new ArrayList<Numbers>();
        //############
        int index = 0;
        for (var num = 0; num <= 1000; num = num + 4) {
            list.add(new Numbers(num));
        }
        //#############
        return list;
    }

    public static List<Numbers> getFive() {
        var list = new ArrayList<Numbers>();
        //############
        int index = 0;
        for (var num = 0; num <= 1000; num = num + 5) {
            list.add(new Numbers(num));
        }
        //#############
        return list;
    }

    public static List<Numbers> getSix() {
        var list = new ArrayList<Numbers>();
        //############
        int index = 0;
        for (var num = 0; num <= 1000; num = num + 6) {
            list.add(new Numbers(num));
        }
        //#############
        return list;
    }

    public static List<Numbers> getSeven() {
        var list = new ArrayList<Numbers>();
        //############
        int index = 0;
        for (var num = 0; num <= 1000; num = num + 7) {
            list.add(new Numbers(num));
        }
        //#############
        return list;
    }

    public static List<Numbers> getEight() {
        var list = new ArrayList<Numbers>();
        //############
        int index = 0;
        for (var num = 0; num <= 1000; num = num + 8) {
            list.add(new Numbers(num));
        }
        //#############
        return list;
    }

    public static List<Numbers> getNine() {
        var list = new ArrayList<Numbers>();
        //############
        int index = 0;
        for (var num = 0; num <= 1000; num = num + 9) {
            list.add(new Numbers(num));
        }
        //#############
        return list;
    }

    public static List<Numbers> getTen() {
        var list = new ArrayList<Numbers>();
        //############
        int index = 0;
        for (var num = 0; num <= 1000; num = num + 10) {
            list.add(new Numbers(num));
        }
        //#############
        return list;
    }

    public static List<Numbers> get20() {
        var list = new ArrayList<Numbers>();
        //############
        int index = 0;
        for (var num = 0; num <= 1000; num = num + 20) {
            list.add(new Numbers(num));
        }

        return list;
    }
    public static List<Numbers> get25() {
        var list = new ArrayList<Numbers>();
        //############
        int index = 0;
        for (var num = 0; num <= 1000; num = num + 25) {
            list.add(new Numbers(num));
        }

        return list;
    }
        public static List<Numbers> get50() {
        var list = new ArrayList<Numbers>();
        //############
        int index = 0;
        for (var num = 0; num <= 1000; num = num + 50) {
            list.add(new Numbers(num));
        }

        return list;
    }
    public static List<Numbers> get100() {
        var list = new ArrayList<Numbers>();
        //############
        int index = 0;
        for (var num = 0; num <= 1000; num = num + 100) {
            list.add(new Numbers(num));
        }

        return list;
    }

    public static boolean isContainsEight(int digit){
        while(digit > 0)
        {
            if(digit%10 == 8)
            {
                break;
            }
            digit = digit/10;
        }
        return (digit>0);
    }



}