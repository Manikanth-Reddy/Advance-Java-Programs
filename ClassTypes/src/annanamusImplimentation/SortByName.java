package annanamusImplimentation;

import java.util.*;

public class SortByName implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareToIgnoreCase(o2.getName());
	}

	public static void main(String[] args) {
		List<Student> li = new ArrayList<>();
		li.add(new Student(1, "abc", "abc@gamil.com"));
		li.add(new Student(2, "bcf", "kjafhkah@kzhfakh"));
		li.add(new Student(3, "mani", "kusdgciufiutrt6"));
		li.add(new Student(4, "llityvBCG diw", "kjyhi5596"));
		Collections.sort(li, new SortByName());
		System.out.println(li);
	} 

}
