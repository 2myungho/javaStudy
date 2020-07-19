class Foo{
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";
	public static void classMethod() {
		System.out.println(classVar); //ok
	//	System.out.println(instanceVar); //Error
	}
	public void instanceMethod() {
		System.out.println(classVar); //ok
		System.out.println(instanceVar); //ok
	}
}
public class StaticApp {
	public static void main(String[] args) {
		System.out.println(Foo.classVar); //OK
	//	System.out.println(Foo.instanceVar); //Error
		Foo.classMethod();
	//	Foo.instanceMethod();
		
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		f1.classVar = "myungho";
		
		System.out.println(f1.classVar + "1");
		
		
		System.out.println(Foo.classVar);
		System.out.println(f2.classVar);
		
		f1.instanceVar = "myungho";
	//	System.out.println(Foo.instanceVar);
		System.out.println(f2.instanceVar);
		
	}
}
