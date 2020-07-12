class Accounting{
	public  double valueOfSupply;
	public  double vatRate;
	public  double expenseRate;
	
	public  void print() {
		System.out.println("Value of supply : " + valueOfSupply);             
		System.out.println("VAT : " + getVAT());                                                 
		System.out.println("Total : " + getTotal());                               
		System.out.println("Expense : " + getExpense()); 
		System.out.println("Income : " + getIncom());                   
		System.out.println("Dividend1 : " + getDiviend1());
		System.out.println("Dividend2 : " + getDiviend2());                       
		System.out.println("Dividend3 : " + getDiviend3());
	}
	public double getDiviend1() {
		return getIncom() *0.5;
	}
	public double getDiviend2() {
		return getIncom() *0.3;
	}
	public double getDiviend3() {
		return getIncom() *0.2;
	}
	public double getIncom() {
		return valueOfSupply - getExpense();
	}
	public double getExpense() {
		return valueOfSupply *expenseRate;
	}
	public double getTotal() {
		return valueOfSupply + getVAT();
	}
	public double getVAT() {
		return valueOfSupply*vatRate;
	}         
}

public class AccountingClassApp {	
	public static void main(String[] args) {
		//Accounting1.valueOfSupply = 10000.0;
		//Accounting1.vatRate = 0.1;                                               
		//Accounting1.expenseRate = 0.3;                                                      		
		//Accounting1.print();
		//
		//Accounting2.valueOfSupply = 20000.0;
		//Accounting2.vatRate = 0.1;                                               
		//Accounting2.expenseRate = 0.3;                                                      		
		//Accounting2.print();   
		//
		//Accounting3.valueOfSupply = 30000.0;
		//Accounting3.vatRate = 0.1;                                               
		//Accounting3.expenseRate = 0.3;                                                      		
		//Accounting3.print();
		
		//instant
		Accounting a1 = new Accounting();
		a1.valueOfSupply = 10000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		
		Accounting a2 = new Accounting();
		a2.valueOfSupply = 20000.0;
		a2.vatRate = 0.1;
		a2.expenseRate = 0.3;
		
		Accounting a3 = new Accounting();
		a3.valueOfSupply = 30000.0;
		a3.vatRate = 0.1;
		a3.expenseRate = 0.3;
		
		a1.print();
		a2.print();
		a3.print();
	}
}
	                                                                             

// �޼ҵ�� ���� ������ �ڵ带 ��Ƽ� �׷����ؼ� �̸��� ���̴� ���� ������ �����̴�.
//Ŭ������ ���� ������ ����, �޼ҵ带 ���� ���� �̸��� �ٿ� ������ ���� �����̴�.
//Ŭ������ ����ϴ� ������ 
//- ���� �ٸ� ������ ����/�޼ҵ���� ȥ��Ǿ� �־ 'Ŭ���� �Ҽ�'�� �����ָ� �� ������� ������ �Ѵ��� �ľ��� �� ����
//- �����Ǿ��ִ� ����,�޼ҵ���� ���� ��ũ��Ʈ�� �� ������ �ʿ� ����, Ŭ������ ����� ���� ������ �ʿ��� �κп� Ŭ������.����/�޼ҵ� ������ �ٷ� ȣ���� �� �� �־� ����.

//�ν��Ͻ��� �ϳ��� Ŭ������ �����ؼ� ���� �ٸ� �������� ���� ���� ���� �޼ҵ带 ���� �������̴�.