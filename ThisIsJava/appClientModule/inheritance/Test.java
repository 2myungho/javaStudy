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
			System.out.println("true 가 리턴될 때 abc메소드도 같이 실행 되는지에 대한 실험" + test0 + test1);
			return true;
		}else {
			System.out.println("flase 가 리턴될 때 abc메소드도 같이 실행 되는지에 대한 실험" + test0 + test1);
			return false;
		}
	}
}
