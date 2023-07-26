package Non_Static_ClassesTypes;

import Non_Static_ClassesTypes.OuterClasee.InnerClass;

public class Test {

	public static void main(String[] args) {
		OuterClasee o=new OuterClasee();
		o.m1();
		InnerClass i=o.new InnerClass();
		i.m2();
	}

}
