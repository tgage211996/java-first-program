package com.h2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int doubleTheNumber(int number) {
        return number;
    }

    private static int add(int[] numbers){
        int sum = 0;
        for(int num: numbers){
            sum = sum + num;
        }
        return sum;
    }
}
