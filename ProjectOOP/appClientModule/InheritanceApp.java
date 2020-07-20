class Cal{
	public int sum(int v1, int v2) {
		return v1 + v2;
	}
	// OverLoading
	public int sum(int v1, int v2, int v3) {
		return this.sum(v1,v2) +v3; //this�� �ڱ� �ڽ��� ����Ų��. Overloading�� ���� �ż��带 ����Ų�� v1 +v2
	}
}
class Cal2 extends Cal{
	public int minus(int v1, int v2) {
		return v1 - v2;
	}
	//Overriding
	public int sum(int v1, int v2) {
		System.out.println("myungho");
		return super.sum(v1,v2);  //super�� �θ� //�θ� Ŭ������ Cal�� sum�� �޾ƿ´�.
	}
}
public class InheritanceApp {
	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println(c.sum(1, 2));
		System.out.println(c.sum(2, 1, 2));
		
		Cal2 c2 = new Cal2();
		System.out.println(c2.minus(5, 6));
		System.out.println(c2.sum(2,5));
		
	}
}

// overriding : �θ� Ŭ������ ����� �ö�Ÿ�� �����, ������
// overloading : �����ϴ�. ž���ϴ�. ���� Ŭ������ ����� ���Ѵ�.