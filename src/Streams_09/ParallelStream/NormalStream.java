package Streams_09.ParallelStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NormalStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11, 22, 33, 44);

        // single stream
        Stream<Integer> stream = list.stream().filter(i -> i > 15);
        stream.forEach(System.out::println);
        // stream is closed


        List<Integer> collect = stream.map(i -> i * 2).collect(Collectors.toList());
        System.out.println(collect);
    }
}
