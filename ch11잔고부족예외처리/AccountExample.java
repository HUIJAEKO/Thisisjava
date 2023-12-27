package ch11잔고부족예외처리;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(10000);
		System.out.println("예금액은" + account.getBalance());
		
		try {
			account.withdraw(30000);
		}catch(InsufficientException e){
			String message = e.getMessage();
			System.out.println(message);
		}
	}

}
