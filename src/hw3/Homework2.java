package hw3;

import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
        int[] array = new int[]{-2, 5, 1, -9, 0, 2, 5, 1, 8, 10};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int array[]) {
        int max, tmp;
        for (int i = 0; i < array.length; i++) {
            max = i;
            for (int find = i + 1; find < array.length; find++) {
                if (array[find] > array[max]) {
                    max = find;
                }

            }
            tmp = array[max]; // 10
            array[max] = array[i]; // 0
            array[i] = tmp; //10


        }
    }
}
