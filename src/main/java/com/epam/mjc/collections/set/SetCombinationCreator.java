package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> result = new LinkedHashSet<>();
        for (String first : firstSet) {
            if (secondSet.contains(first) && !thirdSet.contains(first)) {
                result.add(first);
            }
        }

        for (String third : thirdSet) {
            if (!firstSet.contains(third) && !secondSet.contains(third)) {
                result.add(third);
            }
        }

        return result;
    }
}
