package streamMethod;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestMax2 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<Coustomer> l = new ArrayList<>();
		l.add(new Coustomer(1, "mani", "manikanthn1180@gmail.com"));
		l.add(new Coustomer(3, "ani", "kanthn1180@gmail.com"));
		l.add(new Coustomer(2, "ni", "mahn1180@gmail.com"));
		l.add(new Coustomer(5, "reddy", "mani1180@gmail.com"));
		l.add(new Coustomer(4, "reddy", "mani1180@gmail.com"));
		l.add(new Coustomer(6, "reddy", "mani1180@gmail.com"));
		l.add(new Coustomer(7, "bba", "aibaa@gmail.com"));
		Coustomer c=l.stream().max((e1,e2)->{return e1.getId()-e2.getId();
		}).get();
		System.out.println("The max by id ="+c);
		DataManager d=new DataManager();
		Coustomer c1=l.stream().max((e1,e2)->{
			return e1.getEmail().compareToIgnoreCase(e2.getEmail());
		}).get();
		System.out.println("The max by Email ="+c1);
		Comparator<Coustomer> c2=new Comparator<Coustomer>() {

			@Override
			public int compare(Coustomer o1, Coustomer o2) {
				return o1.getName().compareToIgnoreCase(o2.getName());
			}
		};
		Coustomer c3=l.stream().max(c2).get();
		System.out.println("The max by Name ="+c3);
		Comparator<Coustomer> c4=new Comparator<Coustomer>() {

			@Override
			public int compare(Coustomer o1, Coustomer o2) {
				return o1.toString().compareToIgnoreCase(o2.toString());
			}
		};
		Coustomer c5=l.stream().max(c4).get();
		System.out.println(c5);
	}
}
