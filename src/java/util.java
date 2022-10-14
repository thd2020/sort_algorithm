package src.java;

import java.util.Random;

public class util {
    public static void swap(Object[] arr, int i, int j){
        Object temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static Comparable[] randomIntArray(int n, int min, int max){
        Comparable[] arr = new Comparable[n];
        Random r = new Random();
        for (int i=0; i<n; i++){
            arr[i] = r.nextInt(max)%(max-min+1)+min;
        }
        return arr;
    }
}
