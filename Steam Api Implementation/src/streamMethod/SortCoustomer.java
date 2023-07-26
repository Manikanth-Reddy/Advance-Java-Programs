package streamMethod;

import java.util.ArrayList;
import java.util.List;

public class SortCoustomer {
public static void main(String[] args) {
	List<Coustomer> l = new ArrayList<>();
	l.add(new Coustomer(1, "mani", "manikanthn1180@gmail.com"));
	l.add(new Coustomer(3, "ani", "kanthn1180@gmail.com"));
	l.add(new Coustomer(2, "ni", "mahn1180@gmail.com"));
	l.add(new Coustomer(5, "reddy", "mani1180@gmail.com"));
	l.add(new Coustomer(4, "reddy", "mani1180@gmail.com"));
	l.add(new Coustomer(6, "reddy", "mani1180@gmail.com"));
	l.add(new Coustomer(7, "nibba", "nibaa@gmail.com"));
	DataManager d=new DataManager();
	List<Coustomer>l2=d.sortByEmail(l);
	for(Coustomer a: l2) System.out.println(a);
}
}
