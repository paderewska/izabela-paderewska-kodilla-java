package com.kodilla.stream.niefunkcyjnie;

import java.util.*;
import java.util.stream.Collectors;

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

    public static int getCountEmptyStringUsingJava8(List<String> theList) {

        return (int) theList.stream()
                .filter(n -> n.isEmpty())
                .count();
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

    public static int getCountLength3UsingJava8(List<String> theList) {

    return (int) theList.stream()
            .filter(n -> n.length() == 3)
            .count();
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

    public static List<String> deleteEmptyStringsUsingJava8(List<String> strings) {

    return strings.stream()
            .filter(n -> !n.isEmpty())
            .collect(Collectors.toList());
    }


    public static String getMergedStringUsingJava7(List<String> strings, String s) {
        List<String> theList = new ArrayList<>();

        for(int i=0; i<strings.size(); i++) {
            if(!strings.get(i).isEmpty()) {
                theList.add(strings.get(i));
            }
        }
        String result = String.join(s, theList);
        return result;
    }

    public static String getMergedStringUsingJava8(List<String> strings, String s) {

        return strings.stream()
                .filter(n -> !n.isEmpty())
                .collect(Collectors.joining(s));
    }

    public static List<Integer> getSquares(List<Integer> numbers) {
        List<Integer> theList = new ArrayList<>();

        for(Integer number : numbers) {
            Integer squareNumber = number * number;
            if(!theList.contains(squareNumber)) {
                theList.add(squareNumber);
            }
        }
        return theList;
    }

    public static List<Integer> getSquaresJava8(List<Integer> numbers) {

        return numbers.stream()
                .map(n -> n = n*n)
                .distinct()
                .collect(Collectors.toList());
    }

    public static Integer getMax(List<Integer> numbers) {

        Integer max = Collections.max(numbers);

        return max;
    }

    public static Integer getMaxJava8(List<Integer> numbers) {

        return numbers.stream()
                .max(Comparator.comparing(Integer::valueOf)).get();
    }

    public static Integer getMin(List<Integer> numbers) {

        Integer min = Collections.min(numbers);

        return min;
    }

    public static Integer getMinJava8(List<Integer> numbers) {

        return numbers.stream()
                .min(Comparator.comparing(Integer::valueOf)).get();
    }

    public static Integer getSum(List<Integer> numbers) {

        int sum = 0;
        for(int n : numbers) {
            sum += n;
        }
        return sum;
    }

    public static Integer getSumJava8(List<Integer> numbers) {

        return numbers.stream()
                .mapToInt(n -> n)
                .sum();
    }

    public static Integer getAverage(List<Integer> numbers) {

        int sum = 0;
        for(int n : numbers) {
            sum += n;
        }

        int avr = sum/numbers.size();

        return avr;
    }

    public static Integer getAverageJava8(List<Integer> numbers) {
        OptionalDouble average = numbers.stream()
                .mapToInt(n -> n)
                .average();

        return (int) average.getAsDouble();
    }
}