package TechVerito_ATM_Problem;

public class Start {
	public static int ATMcardno;
	public static int ATMpin;
	private int balance;
	
	Start(int balance){
		this.balance=balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	static {
		ATMcardno=1234567;
	}

	
	public static int generateCard() {
		ATMcardno=(int)(Math.random()*9000000)+1000000;
		return ATMcardno;
	}
	
	 public static int generatePin() {
	        ATMpin=(int)(Math.random()*9000)+1000;
	        return ATMpin;
	    }

}
