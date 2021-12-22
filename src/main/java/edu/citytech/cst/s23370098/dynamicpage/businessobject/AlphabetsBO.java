package edu.citytech.cst.s23370098.dynamicpage.businessobject;

import edu.citytech.cst.s23370098.dynamicpage.model.ABC;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class AlphabetsBO {

    static private Function<Character, String> f = e -> isVowel(e) ? "vowel" : "consonant";

    public static List<ABC> getABC() {
        var list = new ArrayList<ABC>();
        //############
        int index = 0;
        for (var ch = 'A'; ch <= 'Z'; ch++) {
            list.add(new ABC(ch, index++, f.apply(ch)));
        }
        //#############
        return list;
    }

    public static List<ABC> getAbc() {
        var list = new ArrayList<ABC>();

        int index = 0;
        for (var ch = 'a'; ch <= 'z'; ch++) {
            list.add(new ABC(ch, index++, f.apply(ch)));
        }

        return list;
    }

    public static List<ABC> getAll() {
        var list = getABC();
        list.addAll(getAbc());

        return list;
    }

    public static List<ABC> getRAll() {
        var list = getRevABC();
        list.addAll(getRevAbc());

        return list;
    }
    public static List<ABC> getRevABC(){
        var list = new ArrayList<ABC>();

        int index = 0;
        for (char ch = 'Z'; ch >= 'A'; ch--) {
            list.add(new ABC(ch, index++, f.apply(ch)));
        }

        return list;
    }

    public static List<ABC> getRevAbc(){
        var list = new ArrayList<ABC>();

        int index = 0;
        for (char ch = 'z'; ch >= 'a'; ch--) {
            list.add(new ABC(ch, index++, f.apply(ch)));
        }

        return list;
    }

    public static boolean isVowel(char letter) {
        letter = Character.toLowerCase(letter);

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            return true;
        }

        return false;
    }


}
