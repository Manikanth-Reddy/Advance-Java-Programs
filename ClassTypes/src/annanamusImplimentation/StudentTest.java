package annanamusImplimentation;

import java.util.LinkedList;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		Student s=new Student(1, "Mani", "anikanth@gmail.com");
		Student s1=new Student(2, "reddy", "manikanthreddy@gmail.com");
		Student s2=new Student(3, "abc", "nikanth11800@gmail.com");
		List<Student> l=new LinkedList<Student>();
		l.add(s);
		l.add(s1);
		l.add(s2);
		DataManager d=new DataManager();
		d.sortByEmail(l);
		System.out.println(l);
	}

}
