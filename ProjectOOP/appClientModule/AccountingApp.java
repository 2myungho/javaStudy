class Accounting{
	
	public double valueOfSupply;
    public static double vatRate = 0.1;
    public Accounting(double valueOfSupply) {
    	this.valueOfSupply = valueOfSupply;
    }
    public double getVAT() {
        return valueOfSupply * vatRate;
    }
    public double getTotal() {
        return valueOfSupply + getVAT();
    }
}
public class AccountingApp {
    public static void main(String[] args) {
    	Accounting a1 = new Accounting(10000.0);
    	Accounting a2 = new Accounting(20000.0);
    	
    	System.out.println("VAT : " + a1.getVAT());
    	System.out.println("VAT : " + a2.getVAT());
    	
    	System.out.println("Total : " + a1.getTotal());
    	System.out.println("Total : " + a2.getTotal());
    	
    //	Accounting.valueOfSupply = 10000.0;
    //   System.out.println("Value of supply : " + Accounting.valueOfSupply);
    //   System.out.println("VAT : " + Accounting.getVAT());
    //    System.out.println("Total : " + Accounting.getTotal());
    } 
}

//부가가치세(vatRate)와 같이 변치 않는 값은 클래스 소속 사용,
//공급가와 같이 계속 변하는 값은 인스턴스 사용