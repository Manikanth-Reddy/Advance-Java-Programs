package annanamusImplimentation;
import java.util.*;
public class DataManager {
	public List<Student> sortByName(List<Student> list){
		Comparator<Student> c=new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareToIgnoreCase(o2.getName());
			}
		};
		Collections.sort(list,c);
		return list;
	}
	public List<Student> sortById(List<Student> list){
		Comparator<Student> c=new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getId()-o2.getId();
			}
		};
		Collections.sort(list,c);
		return list;
	}
	/* This implementation is know as lambda function
	 * -> this is known as lambda token
	 * Lambda expression is used to provide implementation for functional interface based on the arguments 
	 * and statements return inside the block it will decide the which functional interface we are using
	 * in lambda expression we didn't mention which functional interface we are using 
	 * On the basis of object reference  the arguments data type will be taken by the function itself
	 * lambda expression is only used for functional interface because it accepts only parameters of only one method
	 */
	public List<Student> sortByEmail(List<Student> list){
		Collections.sort(list,(e1,e2)->{
			return e1.getEmail().compareToIgnoreCase(e2.getEmail());
		});
		return list;
	}
}
