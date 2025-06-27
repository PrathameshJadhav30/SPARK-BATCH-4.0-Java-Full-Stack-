/*
map(): transforms elements (1-to-1)
flatMap(): flattens streams of streams (1-to-many)
*/

import java.util.*;
import java.util.stream.*;

public class MapVsFlatMap {
    public static void main(String[] args) {
        List<List<String>> nested = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d")
        );

        System.out.println("Using map():");
        nested.stream()
                .map(list -> list.stream())
                .forEach(stream -> stream.forEach(System.out::println));

        System.out.println("Using flatMap():");
        nested.stream()
                .flatMap(list -> list.stream())
                .forEach(System.out::println);
    }
}
