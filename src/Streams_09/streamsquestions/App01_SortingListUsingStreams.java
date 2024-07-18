package Streams_09.streamsquestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App01_SortingListUsingStreams {
    public static void main(String[] args) {
        // sort list in ascending ana descending order
        List<Integer> list = Arrays.asList(4, 3, 1, 2, 5, 6, 90, 100);

        // sorting list in ascending order
        Collections.sort(list);
        System.out.println("ascending order = "+list);

        // sorting list in descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("descending order = "+list);
    }
}
