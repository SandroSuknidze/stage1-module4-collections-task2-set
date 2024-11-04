package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> result = new TreeSet<>();

        for (Integer num : sourceList) {
            if (num * num <= upperBound && num * num >= lowerBound) {
                result.add(num * num);
            }
        }

        return result;
    }
}
