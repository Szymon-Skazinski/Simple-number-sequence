package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public static int missing(String s) {
        int answer = 0;

        String[] strings = s.split("");

        List<Integer> integers = Arrays.stream(strings)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(integers);
        return answer;
    }
}