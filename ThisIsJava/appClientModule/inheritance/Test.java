package inheritance;

public class Test {
	public int test0;
	public String test1;
	
	public Test(int test0,String test1){
		this.test0 = test0;
		this.test1 = test1;
	}
	
	public boolean abc() {
		if(test0<5) {
			System.out.println("true �� ���ϵ� �� abc�޼ҵ嵵 ���� ���� �Ǵ����� ���� ����" + test0 + test1);
			return true;
		}else {
			System.out.println("flase �� ���ϵ� �� abc�޼ҵ嵵 ���� ���� �Ǵ����� ���� ����" + test0 + test1);
			return false;
		}
	}
}
