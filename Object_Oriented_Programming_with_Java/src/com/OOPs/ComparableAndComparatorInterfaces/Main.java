package com.OOPs.ComparableAndComparatorInterfaces;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        // Comparing using Comparable
        ComparableInterface st1 = new ComparableInterface(21, 86.23f);
        ComparableInterface st2 = new ComparableInterface(24, 76.23f);
        ComparableInterface st3 = new ComparableInterface(19, 96.23f);

        ComparableInterface[] list = {st1, st2, st3};

        // Before Sorting
        System.out.println(Arrays.toString(list)); // [rollNo=21, marks=86.23, rollNo=24, marks=76.23, rollNo=19, marks=96.23]

        //Arrays.sort(list);

        // After Sorting
        System.out.println(Arrays.toString(list)); // [rollNo=24, marks=76.23, rollNo=21, marks=86.23, rollNo=19, marks=96.23]

        // Comparing using Comparator
        ComparatorInterface st4 = new ComparatorInterface(21, 86.23f);
        ComparatorInterface st5 = new ComparatorInterface(24, 76.23f);
        ComparatorInterface st6 = new ComparatorInterface(19, 96.23f);

        ComparatorInterface[] list2 = {st4, st5, st6};

        //Arrays.sort(list2, new SortByRollNo());
        // You can also override compare method as a function parameter or through lambda expression in Arrays.sort() method
        // As a function parameter
        /*Arrays.sort(list2, new Comparator<ComparatorInterface>() {
            @Override
            public int compare(ComparatorInterface o1, ComparatorInterface o2) {
                return o1.rollNo - o2.rollNo;
            }
        });*/
        // As a Lambda function
        Arrays.sort(list2, (o1, o2) -> o1.rollNo - o2.rollNo);

        System.out.println(Arrays.toString(list2)); // [rollNo=19, marks=96.23, rollNo=21, marks=86.23, rollNo=24, marks=76.23]


    }
}
