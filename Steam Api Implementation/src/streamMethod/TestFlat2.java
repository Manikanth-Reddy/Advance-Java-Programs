package streamMethod;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFlat2 {
	public static void main(String[] args) {
		List<Integer> l1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<Integer> l2 = l1.stream().flatMap(e->Stream.of((e*e),(e*2))).collect(Collectors.toList());
		System.out.println(l2);
	}
}
