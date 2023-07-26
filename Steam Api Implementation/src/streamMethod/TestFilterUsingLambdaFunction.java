package streamMethod;
import java.util.*;
import java.util.stream.Collectors;
public class TestFilterUsingLambdaFunction {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		list1.add(3);
		list1.add(6);
		list1.add(7);
		list1.add(8);
		list1.add(9);
		list1.add(2);
		list2=list1.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println(list2);
	}
}
