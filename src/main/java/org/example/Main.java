package org.example;

public class Main {
    private static long[] fibonacciArray;
    public static void main(String[] args) {

        int n = 50;
        fibonacciArray = new long[n+1];
        for(int i = 0 ; i < fibonacciArray.length ; i++){
            System.out.println(fibonacci(i));
        }


    }

    private static long fibonacci(int n) {
        if (n<=1){
            return n;
        }
        if(fibonacciArray[n] != 0){
            return fibonacciArray[n];
        }

        long fibonacciTemp = (fibonacci(n-1) + fibonacci(n-2));
        fibonacciArray[n] = fibonacciTemp;

        return fibonacciTemp;
    }
}