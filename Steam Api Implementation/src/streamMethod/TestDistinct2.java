package streamMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestDistinct2 {
	public static void main(String[] args) {
		List<Coustomer> l = new ArrayList<>();
		l.add(new Coustomer(4, "reddy", "mani1180@gmail.com"));
		l.add(new Coustomer(1, "reddy", "mani1180@gmail.com"));
		l.add(new Coustomer(1, "reddy", "mani1180@gmail.com"));
		l.add(new Coustomer(1, "reddy", "mani1180@gmail.com"));
		l.add(new Coustomer(1, "reddy", "mani1180@gmail.com"));
		l.add(new Coustomer(1, "reddy", "mani1180@gmail.com"));
		l.add(new Coustomer(1, "reddy", "mani1180@gmail.com"));
		l.add(new Coustomer(1, "reddy", "mani1180@gmail.com"));
		l.add(new Coustomer(1, "reddy", "mani1180@gmail.com"));
		l.add(new Coustomer(10, "mani", "manikanthn1180@gmail.com"));
		l.add(new Coustomer(3, "ani", "kanthn1180@gmail.com"));
		l.add(new Coustomer(2, "ni", "mahn1180@gmail.com"));
		l.add(new Coustomer(5, "reddy", "mani1180@gmail.com"));
		l.add(new Coustomer(4, "reddy", "mani1180@gmail.com"));
		l.add(new Coustomer(6, "reddy", "mani1180@gmail.com"));
		l.add(new Coustomer(7, "nibba", "nibaa@gmail.com"));
		List<Coustomer> l2 = l.stream().distinct().collect(Collectors.toList());
		List<Coustomer> collect = l2.stream().sorted((e1, e2) -> {
			return e1.getId() - e2.getId();
		}).collect(Collectors.toList());
		collect.forEach(System.out::println);
	}

}
