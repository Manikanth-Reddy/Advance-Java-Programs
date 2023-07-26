package streamMethod;

import java.util.List;
import java.util.stream.Collectors;

public class TestDistinct {
	public static void main(String[] args) {
		List<Integer> l = List.of(2,5,1,9,6,3,20,2,5,30,20,30);
		List<Integer> c=l.stream().distinct().collect(Collectors.toList());
		System.out.println(c);
	}
}
