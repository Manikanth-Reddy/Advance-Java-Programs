package streamMethod;
import java.util.List;
import java.util.stream.Collectors;
public class TestSorted {
	public static void main(String[] args) {
		List<Integer> l1=List.of(4,2,1,9,6,8,5,10,15,3);
		l1=l1.stream().sorted().collect(Collectors.toList());
		System.out.println(l1);
		
	}
}
