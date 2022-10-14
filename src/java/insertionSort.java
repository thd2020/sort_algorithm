package src.java;

import static src.java.util.*;

public class insertionSort {
    /**
     *基本思想是将一个记录插入到已经排好序的有序表中，从而得到一个新的、记录数增 1 的有序表。
     *在其实现过程使用双层循环，外层循环对除了第一个元素之外的所有元素，内层循环对当前元素前面有序表进行待插入位置查找，并进行移动。
     *平均时间复杂度也是 O(n^2)，空间复杂度为常数阶 O(1)。
     *最优的情况，全数组有序，只需当前数跟前一个数比较一下就可以了，这时一共需要比较 N-1 次，时间复杂度为 O(N)。
     *最坏的情况是待排序数组是逆序的，此时需要比较次数最多，最坏的情况是 O(n^2)
     */
    public static void sort(Comparable[] arr){
        int n = arr.length;
        for (int i=0; i<n; i++){
            for (int j=i; j>0; j--){
                if (arr[j].compareTo(arr[j-1]) < 0){
                    swap(arr, j, j-1);
                }
                else break;
            }
        }
    }
}
