
public class AccountingMethodApp {
	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	public static void main(String[] args) {
		valueOfSupply = 10000.0;
		vatRate = 0.1;                                               
		expenseRate = 0.3;                                                      		
		print();                       
	}
	
	private static void print() {
		System.out.println("Value of supply : " + valueOfSupply);             
		System.out.println("VAT : " + getVAT());                                                 
		System.out.println("Total : " + getTotal());                               
		System.out.println("Expense : " + getExpense());                           
		System.out.println("Income : " + getIncom());                             
		System.out.println("Dividend1 : " + getDiviend1());                       
		System.out.println("Dividend2 : " + getDiviend2());                       
		System.out.println("Dividend3 : " + getDiviend3());
	}
	private static double getDiviend1() {
		return getIncom() *0.5;
	}
	private static double getDiviend2() {
		return getIncom() *0.3;
	}
	private static double getDiviend3() {
		return getIncom() *0.2;
	}
	private static double getIncom() {
		return valueOfSupply - getExpense();
	}
	private static double getExpense() {
		return valueOfSupply *expenseRate;
	}
	private static double getTotal() {
		return valueOfSupply + getVAT();
	}
	private static double getVAT() {
		return valueOfSupply*vatRate;
	}                                                                                                                                                 
}                                                                             

// 메소드는 서로 연괸된 코드를 모아서 그룹핑해서 이름을 붙이는 정리 정돈의 상자이다.
