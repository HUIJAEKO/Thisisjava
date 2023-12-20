package OOPpractice;

public class account {
	public static double valueofsupply;
	private static double vatrate;
	private static double expenserate;
	
	public static void main(String[] args) {
		
		valueofsupply = 30000;
		vatrate = 0.1;
		expenserate = 0.3;
		print();
		
	}



	private static void print() {
		System.out.println("Value of supply:"+valueofsupply);
		System.out.println("VAT:"+getVAT());
		System.out.println("Total:"+getTO());
		System.out.println("Expense:"+getTotal());
		System.out.println("Income:"+getIncome());
		System.out.println("Dividend1:"+getDividend1());
		System.out.println("Dividend2:"+getDividend2());
		System.out.println("Dividend3:"+getDividend3());

	}

	private static double getDividend1() {
		return getIncome()*0.5;
	}
	
	private static double getDividend2() {
		return getIncome()*0.3;
	}
	
	private static double getDividend3() {
		return getIncome()*0.2;
	}
	

	private static double getTO() {
		return valueofsupply+getVAT();
	}

	private static double getTotal() {
		return valueofsupply*expenserate;
	}
	
	private static double getIncome() {
		return valueofsupply-getTotal();
	}

	private static double getVAT() {
		return valueofsupply*vatrate;
	}
}

