package pl.javastart.strumienie;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex1 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(0, x -> x + 1).filter(x -> x > 100 && x < 1000 && x % 5 == 0);
        List<Integer> nums = stream.map(x -> x*3).limit(10).collect(Collectors.toList());
        nums.forEach(x -> System.out.print(x + " "));

        /*
        można zapisać:
        -----------------
        List<Integer> numbers = Stream.iterate(0, x -> x+1)
									.filter(x -> x>100 && x<1000 && x%5 ==0)
									.limit(10)
									.map(x -> x*3)
									.collect(Collectors.toList());
		numbers.forEach(System.out::println);
         */
    }
}
