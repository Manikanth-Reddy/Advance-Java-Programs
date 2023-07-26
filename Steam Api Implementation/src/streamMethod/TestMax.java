package streamMethod;

import java.util.List;

public class TestMax {
	public static void main(String[] args) {
		List<Integer> l = List.of(2, 5, 7, 9, 15, 25, 75,100,2050934);
		Integer m = l.stream().max((e1, e2) -> e1 - e2).get();
		System.out.println("The maximum value in the list ="+m);
		Integer mi=l.stream().min((e1,e2)->e1-e2).get();
		System.out.println(mi);
	}
}
