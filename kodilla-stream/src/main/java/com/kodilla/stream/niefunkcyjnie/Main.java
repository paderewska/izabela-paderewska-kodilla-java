package com.kodilla.stream.niefunkcyjnie;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int getCountEmptyStringUsingJava7(List<String> theList) {

        int counterek = 0;

        for(int i=0; i<theList.size(); i++) {

            if(theList.get(i).isEmpty()) {
                counterek++;
            }
        }
        return counterek;
    }

    public static int getCountLength3UsingJava7(List<String> theList) {

        int counterek = 0;

        for(int i=0; i<theList.size(); i++) {

            if(theList.get(i).length() == 3) {
                counterek++;
            }
        }
        return counterek;
    }

    public static List<String> deleteEmptyStringsUsingJava7(List<String> strings) {

        List<String> theList = new ArrayList<>();

        for(int i=0; i<strings.size(); i++) {
            if(!strings.get(i).isEmpty()) {
                theList.add(strings.get(i));
            }
        }
        return theList;
    }


    public static String getMergedStringUsingJava7(List<String> strings, String s) {
        List<String> theList = new ArrayList<>();

        for(int i=0; i<strings.size(); i++) {
            if(!strings.get(i).isEmpty()) {
                theList.add(strings.get(i));
            }
        }
        return "cos";
    }

    public static List<Integer> getSquares(List<Integer> numbers) {
        return new ArrayList<>();
    }

    public static Integer getMax(List<Integer> numbers) {
        return 0;
    }

    public static Integer getMin(List<Integer> numbers) {
        return 0;
    }

    public static Integer getSum(List<Integer> numbers) {
        return 0;
    }

    public static Integer getAverage(List<Integer> numbers) {
        return 0;
    }
}
