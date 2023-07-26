package streamMethod;
import java.util.*;
public class DataManager {
	public List<Coustomer> sortByName(List<Coustomer> list){
		Comparator<Coustomer> c=new Comparator<Coustomer>() {
			@Override
			public int compare(Coustomer o1, Coustomer o2) {
				return o1.getName().compareToIgnoreCase(o2.getName());
			}
		};
		Collections.sort(list,c);
		return list;
	}
	public List<Coustomer> sortById(List<Coustomer> list){
		Comparator<Coustomer> c=new Comparator<Coustomer>() {
			@Override
			public int compare(Coustomer o1, Coustomer o2) {
				return o1.getId()-o2.getId();
			}
		};
		Collections.sort(list,c);
		return list;
	}
	public List<Coustomer> sortByEmail(List<Coustomer> list){
		Collections.sort(list,(e1,e2)->{
			return e1.getEmail().compareToIgnoreCase(e2.getEmail());
		});
		return list;
	}
}
