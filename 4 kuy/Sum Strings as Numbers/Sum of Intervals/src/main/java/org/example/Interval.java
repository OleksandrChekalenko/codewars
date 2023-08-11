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
        int[] master, slave;
        int x, y;
        List<int[]> mod = new ArrayList<>(Arrays.stream(intervals).toList());
        for (int i = 0; i < mod.size(); i++) {
            for (int j = 1; j < mod.size(); j++) {
                master = mod.get(i);
                slave = mod.get(j);
                if (i != j && master[0] < slave[1] && slave[0] < master[1]) {
                    x = Math.min(master[0], slave[0]);
                    y = Math.max(master[1], slave[1]);

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

    public static int sumIntervals5(int[][] intervals) {
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

    public static int sumIntervals2(int[][] intervals) {
        return (int) of(requireNonNullElse(intervals, new int[0][])).flatMapToInt(i -> range(i[0], i[1])).distinct().count();
    }

    //Heap exception
    public static int sumIntervalsVer(int[][] intervals) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int[] ints : intervals) {
            for (int anInt : ints) {
                min = Math.min(min, anInt);
                max = Math.max(max, anInt);
            }
        }

        int[] resArr = new int[max - min + 1];

        for (int[] interval : intervals) {
            int left = interval[0];
            int right = interval[1];

            for (int i = left; i < right; i++) {
                resArr[i - min] = 1;
            }
        }

        int res = 0;
        for (int j : resArr) {
            res += j;
        }

        return res;
    }
}