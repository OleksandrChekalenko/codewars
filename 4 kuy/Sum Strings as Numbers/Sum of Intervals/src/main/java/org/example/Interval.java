package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.stream.IntStream.range;
import static java.util.stream.Stream.of;
import static java.util.Objects.requireNonNullElse;

public class Interval {

    public static int sumIntervals(int[][] intervals) {
        if (intervals.length == 0)
            return 0;

        List<int[]> coveredIntervals = Arrays.stream(intervals).toList();
        List<int[]> mod = new ArrayList<>(coveredIntervals);

        for (int i = 0; i < mod.size(); i++) {
            for (int j = 1; j < mod.size(); j++) {
                if (i != j && mod.get(i)[0] < mod.get(j)[1]
                        && mod.get(j)[0] < mod.get(i)[1]) {
                    int x = Math.min(mod.get(i)[0], mod.get(j)[0]);
                    int y = Math.max(mod.get(i)[1], mod.get(j)[1]);

                    mod.add(new int[]{x, y});
                    mod.remove(i);
                    mod.remove(j - 1);
                    i = 0;
                    j = 0;
                }
            }
        }

        return mod.stream().map(i -> i[1] - i[0]).reduce(0, Integer::sum);
    }

    public static int sumIntervals2(int[][] intervals) {
        return (int) of(requireNonNullElse(intervals, new int[0][])).flatMapToInt(i -> range(i[0], i[1])).distinct().count();
    }

    public static int sumIntervals3(int[][] intervals) {

        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        Set<Double> numbers = new HashSet<>();
        for (int[] interval : intervals) {
            for (double num = interval[0] + 0.5; num < interval[1]; num++) {
                numbers.add(num);
            }
        }

        return numbers.size();
    }
}