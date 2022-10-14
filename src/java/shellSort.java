package src.java;

import static src.java.util.*;

public class shellSort {
    public static void sort(Comparable[] arr){
        int n = arr.length;
        for (int gap = n/2; gap > 0; gap = gap / 2){
            for (int i=0; i<n - gap; i++){
                if (arr[i].compareTo(arr[i+gap]) > 0){
                    swap(arr, i, i+gap);
                }
            }
        }
    }
}
