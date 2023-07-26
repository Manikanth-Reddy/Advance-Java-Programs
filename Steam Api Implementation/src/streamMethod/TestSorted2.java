package streamMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestSorted2 {
	public static void main(String[] args) {
		List<Coustomer> l = new ArrayList<>();
		l.add(new Coustomer(1, "mani", "manikanthn1180@gmail.com"));
		l.add(new Coustomer(3, "ani", "kanthn1180@gmail.com"));
		l.add(new Coustomer(2, "ni", "mahn1180@gmail.com"));
		l.add(new Coustomer(5, "reddy", "mani1180@gmail.com"));
		l.add(new Coustomer(4, "reddy", "mani1180@gmail.com"));
		l.add(new Coustomer(6, "reddy", "mani1180@gmail.com"));
		l.add(new Coustomer(7, "nibba", "nibaa@gmail.com"));
		/*
		 * Anonymous class Comparator<Coustomer> c=new Comparator<Coustomer>() { public
		 * int compare(Coustomer o1, Coustomer o2) { return o1.getId()-o2.getId(); } };
		 * List<Coustomer> l2=l.stream().sorted(c).collect(Collectors.toList());
		 */
		List<Coustomer> l2 = l.stream().sorted((e1, e2) -> {
			return e1.getName().compareToIgnoreCase(e2.getName());
		}).collect(Collectors.toList());
		for (Coustomer d : l2)
			System.out.println(d);
	}
}
