package streamMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFilter {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		list1.add(3);
		list1.add(6);
		list1.add(7);
		list1.add(8);
		list1.add(9);
		list1.add(2);
				//		By using Stream method 
		Stream<Integer> streamlist=list1.stream();
		Predicate<Integer> pre=new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				return t%2==0;
			}
		};
		list2=streamlist.filter(pre).collect(Collectors.toList());	
		System.out.println(list2);
	}
}
