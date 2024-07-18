package Streams_09.streamsquestions;

import java.util.Arrays;
import java.util.Collections;

public class App02_SortingArraysUsingStreams {
    public static void main(String[] args) {
        int[] arr = {100, 1, 2, 3, 40, 500};

        // ascending order of array
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // descending order of array
        int[] arrconverted = Arrays.stream(arr) // convert array to stream
                .boxed() // box each int to Integer
                .sorted(Collections.reverseOrder()) // reverse the array
                .mapToInt(Integer::intValue).toArray();// convert back Integer to int
        System.out.println(Arrays.toString(arrconverted));

    }
}
