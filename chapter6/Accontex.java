package ch06Practice;

public class Accontex {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("현재잔고:"+account.getBalance());
		
		account.setBalance(20000);
		System.out.println("현재잔고:"+account.getBalance());
		
		account.setBalance(-10000);
		System.out.println("현재잔고:"+account.getBalance());
		
		account.setBalance(5000);
		System.out.println("현재잔고:"+account.getBalance());
	}

}
