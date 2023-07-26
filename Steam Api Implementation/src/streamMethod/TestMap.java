package streamMethod;

import java.util.List;
import java.util.stream.Collectors;

public class TestMap {
	public static void main(String[] args) {
		List<Integer> l1 = List.of(1, 2, 4, 7, 4, 9, 10, 15);
		List<Integer> l2 = l1.stream().map(e -> e * e).collect(Collectors.toList());
		System.out.println(l2);
	}
}
