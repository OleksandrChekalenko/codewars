/*
import java.math.BigInteger;

public class Solution {
    public static int zeros(int n) {
        if (n == 0) return 0;
        BigInteger resultFib = BigInteger.valueOf(1);
        int res = 0;

        for (int i = 1; i <= n; i++)
           resultFib = resultFib.multiply(BigInteger.valueOf(i));

        for (String zer : String.valueOf(resultFib).split("")) {
            if (zer.equals("0"))
                res++;
        }
//        System.out.println(resultFib);
//        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(zeros(20));
    }
}*/
import java.lang.Math;

public class Solution {
    public static int zeros(int n) {
        int numOfZeroes=0;
        while(n!= 0){
            numOfZeroes += (int)Math.floor(n/5);
            n/=5;
        }
        return numOfZeroes;
    }
}