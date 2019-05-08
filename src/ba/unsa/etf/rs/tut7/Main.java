package ba.unsa.etf.rs.tut7;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Creating a list of integers
        List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);

        System.out.println("The sorted stream is : ");

        // displaying the stream with elements
        // sorted in natural order
        list.stream().sorted().forEach(System.out::println);
    }
}
