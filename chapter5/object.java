package personalproject;

class Accounting{
	public double valueofsupply;
	public double vatrate;
	public double expenserate;
	
	public void print() {
		System.out.println("Value of supply:"+valueofsupply);
		System.out.println("VAT:"+getVAT());
		System.out.println("Total:"+getTO());
		System.out.println("Expense:"+getTotal());
		System.out.println("Income:"+getIncome());
		System.out.println("Dividend1:"+getDividend1());
		System.out.println("Dividend2:"+getDividend2());
		System.out.println("Dividend3:"+getDividend3());

	}

	private double getDividend1() {
		return getIncome()*0.5;
	}
	
	private double getDividend2() {
		return getIncome()*0.3;
	}
	
	private double getDividend3() {
		return getIncome()*0.2;
	}
	

	private double getTO() {
		return valueofsupply+getVAT();
	}

	private double getTotal() {
		return valueofsupply*expenserate;
	}
	
	private double getIncome() {
		return valueofsupply-getTotal();
	}

	private double getVAT() {
		return valueofsupply*vatrate;
	}
}
	
	
public class object {
	
	public static void main(String[] args) {
		Accounting a1 = new Accounting();
		a1.valueofsupply = 20000;
		a1.vatrate = 0.05;
		a1.expenserate = 0.2;
		a1.print();
		
		Accounting a2 = new Accounting();
		a2.valueofsupply = 30000;
		a2.vatrate = 0.1;
		a2.expenserate = 0.3;
		a2.print();
	}
}



	


