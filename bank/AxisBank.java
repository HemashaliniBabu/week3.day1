package week3day1.bank;

public class AxisBank {
	
	public void deposit() {
		System.out.println("AxisBank class --> Deposit Over ridden");
	}
	
	public static void main(String[] args) {
		
		AxisBank Object = new AxisBank();
		Object.deposit();
		
		Object.saving();
		Object.fixed();
	}
	private void fixed() {
		
		System.out.println("BankInfo class --> saving - 20%");
		
		
	}

	private void saving() {
		
		System.out.println("BankInfo class --> fixed - 18%");
		
	}



}
