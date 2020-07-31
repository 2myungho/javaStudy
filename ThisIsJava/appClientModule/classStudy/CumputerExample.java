package classStudy;
//매개 변수의 수를 모를 경우
public class CumputerExample {

	public static void main(String[] args) {
		Cumputer myCom = new Cumputer();
		int[] values1 = {1,2,3}; //배열을 만들어줌
		int result1 = myCom.sum1(values1);
		System.out.println("result1 : " + result1);
		
		int result2 = myCom.sum1(new int[] {1,2,3,4,5});
		System.out.println("result2 : " + result2);
		
		System.out.println("----------------...-----------");
		
		int result3 = myCom.sum2(1,2,3);
		System.out.println("result3 : " + result3);
		
		int result4 = myCom.sum2(1,2,3,4,5);
		System.out.println("result4 : " + result4);
		

	}

}
