package com.develogical;

import sun.awt.image.ImageWatched;
import sun.jvm.hotspot.oops.ArrayKlass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was a " +
                    "very distyyinguished English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        else if (query.toLowerCase().contains("name")) {
            return "Diana";
        }
        else if (query.toLowerCase().contains("numbers is the largest") ) {
            ArrayList<Integer> a = new ArrayList<>();
            Pattern p = Pattern.compile("-?\\d+");
            Matcher m = p.matcher(query);
            while (m.find()) {
                a.add(Integer. parseInt(m.group()));
            }
            return a.stream().max(Integer::compare).toString();
        }
        else if (query.toLowerCase().contains("plus") ) {
            ArrayList<Integer> a = new ArrayList<>();
            Pattern p = Pattern.compile("-?\\d+");
            Matcher m = p.matcher(query);
            while (m.find()) {
                a.add(Integer. parseInt(m.group()));
            }
            return a.stream().reduce(Integer::sum).toString();
        }



        return "";
    }
}
