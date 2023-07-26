package streamMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestInsert {

	public static void main(String[] args) {
		List<Coustomer> l=new ArrayList<>();
		l.add(new Coustomer(1, "mani", "manikanthn1180@gmail.com"));
		l.add(new Coustomer(3, "ani", "kanthn1180@gmail.com"));
		l.add(new Coustomer(2, "ni", "mahn1180@gmail.com"));
		l.add(new Coustomer(5, "reddy", "mani1180@gmail.com"));
		l.add(new Coustomer(4, "reddy", "mani1180@gmail.com"));
		l.add(new Coustomer(6, "reddy", "mani1180@gmail.com"));
		l.add(new Coustomer(7, "nibba", "nibaa@gmail.com"));
		List<Coustomer>l2=l.stream().filter(e->e.getName().startsWith("m")).collect(Collectors.toList());
		for(Coustomer c: l2) System.out.println(c);
	}

}
