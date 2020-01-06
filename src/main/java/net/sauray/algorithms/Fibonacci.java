package net.sauray.algorithms;

import java.util.*;

class Fibonacci {

    public static int fibNaive(int n) {
        if(n == 1 || n == 2) { return 1; }
        return fibNaive(n-1) + fibNaive(n-2);
    }

    public static int fibMemoize(int n, Integer[] memo) {
        if(memo[n] == null) {
            memo[n] = fibMemoize(n-1, memo) + fibMemoize(n-2, memo);
        }
        return memo[n];
    }

    public static int fibBottomUp(int n, Integer[] memo) {
        if(n < 2) { return memo[n]; }
        for(int i=2; i<n; i++) {
            if(memo[n] == null) {
                memo[n] = memo[n-1] + memo[n-1];
            }
        }
        return memo[n];
    }

    public static void main( String[] args )
    {
        int n=10;

        Integer[] memo = new Integer[n+1];
        memo[0] = 0;
        memo[1] = 1;

        System.out.println( "Fibonacci" );
        int res = fibNaive(n);
        int resMemo = fibMemoize(n, memo);
        int resBottomUp= fibBottomUp(n, memo);
        System.out.println(res);
        System.out.println(resMemo);
        System.out.println(resBottomUp);
    }
    
}
