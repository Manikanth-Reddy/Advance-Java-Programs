package streamMethod;

import java.util.List;
import java.util.stream.Collectors;

public class TestFlat {
	public static void main(String[] args) {
		List<Integer> l1 = List.of(1, 2, 3);
		List<Integer> l2 = List.of(4, 5, 6);
		List<Integer> l3 = List.of(7, 8, 9);
		List<List<Integer>>li=List.of(l1,l2,l3);
		List<Integer>list=li.stream().flatMap(e->e.stream()).collect(Collectors.toList());
		System.out.println(list);
	}
}
