package TechVerito_ATM_Problem;

import java.util.Scanner;

public class AllMain {
	public static void main(String[] args) {
		Start s=new Start(30000);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to ATM System !!!");
		System.out.println("---------------------------");
		System.out.println("1. Generate new ATM Card \n2. Use Your ATM Card");
		
		System.out.println("Enter your choice(1 or 2) : ");
		System.out.println("---------------------------");
		int choice=sc.nextInt();
		int balance = 10000;
		if(choice==1 || choice==2){
			if(choice==1){
				int newCard=Start.generateCard();
				System.out.println("Your new Card Number is : "+newCard);
			}else if(choice==2) {
				System.out.println("Enter Your ATM Card Number : ");
				int ATMn=sc.nextInt();
				Start.ATMcardno=ATMn;
				   while(true){
					    System.out.println("---------------------------");
			            System.out.println("\n1. Check Balance");
			            System.out.println("2. Change ATM Pin");
			            System.out.println("3. Generate ATM Pin");
			            System.out.println("4. Withdraw Amount");
			            System.out.println("5. Deposit Amount");
			            System.out.println("6. Exit");
			            System.out.print("Enter your choice (1/2/3/4/5/6): ");

			            int ch=sc.nextInt();

			            switch(ch){
			                case 1:
			                    if(Start.ATMpin==0){
			                        System.out.println("You have not Generated PIN, Please Generate it !!");
			                    }else{
			                        System.out.println("Your Balance is : ₹"+s.getBalance());
			                    }
			                    break;

			                case 2:
			                    System.out.println("You have selected Change ATM Pin");
			                    System.out.print("Enter new ATM Pin : ");
			                    int npin=sc.nextInt();
			                    Start.ATMpin=npin;
			                    System.out.println("Pin is Changed Successfully!");
			                    break;

			                case 3:
			                    System.out.println("New Generated ATM pin: "+Start.generatePin());
			                    break;

			                case 4:
			                    if(Start.ATMpin==0){
			                        System.out.println("You have not Generated PIN, Please Generate it !!");
			                    }else{
			                        System.out.print("Enter amount to withdraw : ");
			                        int amount=sc.nextInt();
			                        if(amount>CashInATM.checkCash()) {
			                        	System.out.println("ATM Does not have this amount of Cash left!!!");
			                        }
			                        else {
			                        	 if(amount>balance){
					                            System.out.println("Insufficient Balance in Your Account!");
			                        	 }else{
			                        		 CashInATM.withdrawATMCash(amount); 
				                             balance-=amount;
				                             System.out.println("Withdrawn : ₹"+amount);
				                             System.out.println("Remaining Balance : ₹"+balance);
				                         }
			                        }
			                       
			                    }
			                    break;

			                case 5:
			                    System.out.print("Enter amount to deposit : ");
			                    int dep=sc.nextInt();
			                    balance+=dep;
			                    System.out.println("Deposited : ₹"+dep);
			                    System.out.println("Updated Balance : ₹"+balance);
			                    break;

			                case 6:
			                    System.out.println("Thank you for using our ATM!");
			                    sc.close();
			                    System.exit(0); 
			                    break;

			                default:
			                    System.out.println("Enter a valid choice!!!");
			            }			
				   }
			}
			
		}else {
			System.out.println("Please Enter Valid Choice !!!");
			System.out.println("Visit Again...Bye!!!");
		}
		
		
		sc.close();
	}

}