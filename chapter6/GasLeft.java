package ch06;

public class GasLeft {
	
	int gas;
	
	void gasLeft(int gas) {
		this.gas=gas;
	}
	
	boolean taf() {
		if(gas==0) {
			System.out.println("가스가 없습니다");
			return false;
		}
		System.out.println("가스가 있습니다");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
			System.out.println(gas+"남았습니다");
			gas-=1;
			}else {
				System.out.println("가스가 없습니다");
				return;
				}
		}
	}
	
}
