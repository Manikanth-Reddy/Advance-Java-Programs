package streamMethod;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethod {
	public static void main(String[] args) {
		List<Integer> l = List.of(1, 2, 3, 5, 7, 9, 10);
		List<Integer>l2=new ArrayList<>();
		l.forEach(e->l2.add(e*e));
		System.out.println(l2);
	}
//		 l.forEach(e -> System.out.println(e * e));
}
