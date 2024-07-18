package Streams_09.ParallelStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App01_ParallelStream {
    public static void main(String[] args) {
        // sequential processing
        List<Integer> list = Arrays.asList(11,22);

        long sequentialProcessingStartTime = System.currentTimeMillis();
        list.stream()
                .map((val)->val*val)
                .forEach((val)-> System.out.println(val));

        System.out.println("Sequential Processing Time Taken : "+(System.currentTimeMillis()-sequentialProcessingStartTime)+" milliseconds");



        // Parallel processing
        long parallelProcessingStartTime = System.currentTimeMillis();
        list.parallelStream()
                .map((val)->val*val)
                .map((val)->val*2).collect(Collectors.toList());



    }
}
