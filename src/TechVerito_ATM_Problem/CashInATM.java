package TechVerito_ATM_Problem;

//What if ATM does not have cash???

public class CashInATM {
	public static int atmcash;
	
	static {
		atmcash=30000;
	}
	
	public static int checkCash() {
		return atmcash;
	}
	public static void withdrawATMCash(int amt) {
		atmcash-=amt;
	}

}
