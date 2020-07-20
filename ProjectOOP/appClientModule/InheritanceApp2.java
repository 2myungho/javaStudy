class Call{
	int v1,v2;
	call(int v1, int v2){
		System.out.println("cal init!");
		this.v1 = v1; this.v2 = v2;
	}
}
class Call2 extends Call{
	call2(int v1, int v2){
		super(v1,v2);
		System.out.println("call2 init");
	}
}
public class InheritanceApp2 {
	public static void main(String[] args) {
		Call c = new Call(2,1);		
		Call2 c2 = new Call2(2,1);
		
	}
}
