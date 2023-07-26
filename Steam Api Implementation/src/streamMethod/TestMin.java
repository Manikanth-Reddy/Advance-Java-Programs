package streamMethod;

import java.util.ArrayList;
import java.util.List;

public class TestMin {

	public static void main(String[] args) {
		List<Coustomer> l = new ArrayList<>();
		l.add(new Coustomer(1, "mani", "manikanthn1180@gmail.com"));
		l.add(new Coustomer(3, "ani", "kanthn1180@gmail.com"));
		l.add(new Coustomer(2, "ni", "mahn1180@gmail.com"));
		l.add(new Coustomer(5, "reddy", "mani1180@gmail.com"));
		l.add(new Coustomer(4, "reddy", "mani1180@gmail.com"));
		l.add(new Coustomer(6, "reddy", "mani1180@gmail.com"));
		l.add(new Coustomer(7, "nibba", "nibaa@gmail.com"));
		Coustomer c = l.stream().min((e1, e2) -> {
			return e1.getId() - e2.getId();
		}).get();
		System.out.println("The min by Id =" + c);
	}
}
