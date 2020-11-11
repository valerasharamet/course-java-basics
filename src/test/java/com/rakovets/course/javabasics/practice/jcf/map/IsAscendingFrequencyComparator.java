package com.rakovets.course.javabasics.practice.jcf.map;

import java.util.Comparator;
import java.util.Map;

public class IsAscendingFrequencyComparator implements Comparator<String> {
    Map<String, Double> base;

    public IsAscendingFrequencyComparator(Map<String, Double> base) {
        this.base = base;
    }

    @Override
    public int compare (String a1 , String a2) {
        return base.get(a1).compareTo(base.get(a2));
    }
}
