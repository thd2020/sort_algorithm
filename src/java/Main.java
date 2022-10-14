package src.java;

import java.util.*;
import static src.java.util.*;

public class Main {
    public static void main(String[] args){
        while(true) {
            System.out.println("Please choose one mode:\n1.random array ; 2.input ; 3.exit ;");
            Scanner s = new Scanner(System.in);
            int geOpt = s.nextInt();
            Comparable[] arr = new Comparable[0];
            if (geOpt == 1){
                System.out.print("Specify the arrayLength, minValue and maxValue\narrayLength:");
                int arrayLength = s.nextInt();
                System.out.print("minValue:");
                int minValue = s.nextInt();
                System.out.print("maxValue:");
                int maxValue = s.nextInt();
                arr = randomIntArray(arrayLength, minValue, maxValue);
            }
            if (geOpt == 2){
                System.out.println("Input your integer array, split by space, end with space+any other character");
                List<Integer> l = new ArrayList<>();
                while (s.hasNextInt()){
                    l.add(s.nextInt());
                }
                arr = l.toArray(l.toArray(new Integer[0]));
                String blank = s.nextLine();
            }
            if (geOpt == 3){
                System.out.println("Bye!");
                System.exit(0);
            }
            System.out.println("Original: " + Arrays.toString(arr));
            System.out.println("Choose a sort method:\n1.insertion\n2.shell");
            int mtd = s.nextInt();
            switch (mtd) {
                case 1 -> {
                    System.out.println("You've chosen insertion sort");
                    long start = System.nanoTime();
                    insertionSort.sort(arr);
                    long finish = System.nanoTime();
                    long timeElapsed = finish - start;
                    System.out.println("Sorted: " + Arrays.toString(arr));
                    System.out.println("Time elapsed: " + timeElapsed +" nanoSeconds\n");
                }
                case 2 -> {
                    System.out.println("You've chosen shell sort");
                    long start = System.nanoTime();
                    shellSort.sort(arr);
                    long finish = System.nanoTime();
                    long timeElapsed = finish - start;
                    System.out.println("Sorted: " + Arrays.toString(arr));
                    System.out.println("Time elapsed: " + timeElapsed +" nanoSeconds\n");
                }
            }
        }
    }
}
