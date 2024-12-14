package A2000A3000.S2215FindTheDifferenceOfTwoArrays;

import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> firstSet = new HashSet<>();
        HashSet<Integer> secondSet = new HashSet<>();

        LinkedList<List<Integer>> resultList = new LinkedList<>();
        LinkedList<Integer> firstList = new LinkedList<>();
        LinkedList<Integer> secondList = new LinkedList<>();

        resultList.add(firstList);
        resultList.add(secondList);


        for (int val : nums1) {
            firstSet.add(val);
        }

        for (int val : nums2) {
            secondSet.add(val);
        }

        HashSet<Integer> retain = new HashSet<>(firstSet);
        retain.retainAll(secondSet);

        firstSet.removeAll(retain);
        secondSet.removeAll(retain);

        firstList.addAll(firstSet);
        secondList.addAll(secondSet);

        return resultList;
    }
}