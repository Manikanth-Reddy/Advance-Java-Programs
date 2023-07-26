package Non_Static_ClassesTypes;

public class OuterClasee {
	int a=20;
	@SuppressWarnings("unused")
	public void m1() {
		System.out.println("m1() in outer class");
		InnerClass i=new InnerClass();
	}
	public class InnerClass{
		int b=25;
		public void m2() {
			System.out.println("m2() in Inner Class");
		}
	}
}
