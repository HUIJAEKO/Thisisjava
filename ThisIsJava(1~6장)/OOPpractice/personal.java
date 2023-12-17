package OOPpractice;

public class personal{
	public static void main(String[] args) {
			
		double valueofsupply = 30000;
		double Vatrate = 0.1;
		double expense = 0.3;
		double vat = valueofsupply*Vatrate;
		double totalexpense = valueofsupply*expense;
		double income = valueofsupply-totalexpense;
		
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		double devidend1 = income*dividendRates[0];
		double devidend2 = income*dividendRates[1];
		double devidend3 = income*dividendRates[2];

		System.out.println("Value of supply:"+valueofsupply);
		System.out.println("VAT:"+vat);
		System.out.println("Total:"+(valueofsupply+vat));
		System.out.println("Expense:"+totalexpense);
		System.out.println("Income:"+income);
		System.out.println("Dividend1:"+devidend1);
		System.out.println("Dividend2:"+devidend2);
		System.out.println("Dividend3:"+devidend3);
		
	}
}