package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet,
                                            Set<String> secondSet, Set<String> thirdSet) {
        Set<String> newSet = new HashSet<>();

        for (String st : firstSet) {
            if (secondSet.contains(st) && !thirdSet.contains(st)) {
                newSet.add(st);
            }
        }
        for (String st1 : thirdSet) {
            if (!firstSet.contains(st1) && !secondSet.contains(st1)){
                newSet.add(st1);
            }
        }
        return newSet;
    }
}
