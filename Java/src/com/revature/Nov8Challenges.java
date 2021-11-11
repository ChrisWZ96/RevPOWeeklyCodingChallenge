package com.revature;

import java.io.IOException;
import java.util.Arrays;

public class Nov8Challenges {

    public static void main(String[] args){
        int arr[]={14, 12, 70, 15, 99, 65, 21, 90};
        int [] example = {19, 38, 76, 133};
        calculateMax(arr);
        System.out.println(gcd(example));
    }


    public static void calculateMax(int arr[]) {
        int max = arr[0];
        int min = arr[0];
        int minIndex = 0;
        int maxIndex = 0;

        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
            if(arr[i] < min){
                min = arr[i];
                minIndex = i;
            }
        }

        System.out.println("Max profit can be gained by buying at Day "+(minIndex+1)+" and selling at Day "+(maxIndex+1)+ ".");
        System.out.println("Max profit: " + (max-min));
    }

    public static int getGCD(int x, int y){
        if(x == 0){
            return y;
        }
        return getGCD(y%x,x);
    }

    public static int gcd(int arr[]){
        int denominator = 0;
        for(int i=0;i< arr.length;i++){
            denominator = getGCD(denominator,arr[i]);
            if(denominator == 1){
                return 1;
            }
        }
        return denominator;
    }
}



