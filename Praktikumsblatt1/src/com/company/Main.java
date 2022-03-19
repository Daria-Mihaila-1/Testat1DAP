package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {9,10, 0, 0, 0, 7,0, 7,4, 9, 0, 1};
        int[] arr2 = {0, 0, 0, 0};
        int[] arr3 = {80, 7, 1, 0, 11, 72, 0, 0, 37, 61};
        //System.out.println(countMaximum(arr));
        //System.out.println(checkArray(arr));
        //System.out.println(checkArray(arr2));
        //System.out.println(toString(arr)/*.getClass().getSimpleName()*/);
        System.out.println(twoTimes(arr2));
        System.out.println(countSequences(arr3));
        System.out.println(countSequences(arr2));
        System.out.println(countSequences(arr));


    }
    public static int[] ceva(){
        return ;
    }
    public static int countMaximum(int arr[]){
        int count = 1;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (max < arr[i])
            {
                max = arr[i];
                count = 1;
            }
            else if( max == arr[i])
            {
                count++;
            }
        }
        return count;
    }

    private static boolean checkArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n / 2; i++){
            if (arr[i] != arr[n - 1 - i]){
                return false;
            }
        }
        return true;
    }

    public static String toString(int[] arr)
    {
        String answer = "";
        for (int i = 0; i < arr.length; i++){
            answer += arr[i];
            if (i != arr.length -1)
            {
                answer += ",";
            }
        }
        return answer;
    }

    public static boolean twoTimes(int[] arr){
        if (arr.length % 2 != 0)
        {
            return false;
        }

        int i = 0;
        int aux;
        int j;
        while (i < arr.length){
            for(j = i+1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                        aux = arr[i+1];
                        arr[i+1] = arr[j];
                        arr[j] = aux;
                        break;
                }
            }
            if (j == arr.length){
                return false;
            }
            i+= 2;
        }
        return true;
    }

    public static int countSequences( int[] arr ){
        int count = 0;
        int i = 0;
        while(i < arr.length){
            if (arr[i] != 0){
                count++;
                while (i < arr.length - 1 && arr[i + 1] != 0){
                    i++;  //goes through all the numbers that are != 0
                }
            }
            i++;// the "iterator" landed on a 0 so it jumps over it
        }
        return count;
    }
}
