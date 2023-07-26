package static_Classes;


public class OuterClass {
	int a=20;
	public static void m1() {
		System.out.println("m1() in outer class");
			InnerClass.m1();
	}
	public static class InnerClass{
		int b=25;
		private static void m1() {
			System.out.println("private m1 method of inner class");
		}
		public static void m2() {
			System.out.println("m2() in Inner Class");
		}
	}
}
