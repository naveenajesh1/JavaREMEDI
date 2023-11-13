import java.util.Scanner;
class InvalidAmountException extends Exception{
	InvalidAmountException(String str){
		super(str);
	}	
}
class InsufficientFundsException extends Exception{
class Customer{
	int accno;
	String acctype;
	String name;
	int accbalance;
	Scanner sc=new Scanner(System.in);
	public void setCustomerDetails() {
		System.out.println("Enter the account number:");
		accno=sc.nextInt();
		System.out.println("Enter the account type:");
		acctype=sc.next();
		System.out.println("Enter the customer name:");
		name=sc.next();
		System.out.println("Enter the account balance:");
		accbalance=sc.nextInt();
	}

public void getCustomerDetails() {
	System.out.println("--------------------------------------------");
	System.out.println("The customer details are:");
	System.out.println("Account number: "+ accno);
	System.out.println("Account type: "+ acctype);
	System.out.println("customer name: "+ name);
	System.out.println("Account balance: "+ accbalance);
	System.out.println("--------------------------------------------");
	}

public void searchAccountNumber() {
	
}
}
public class BankCustomer {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		InvalidAmountException amountException=new InvalidAmountException("Invalid amount");
		InsufficientFundsException fundsException=new class InsufficientFundsException("")
		System.out.println("Enter the no of customers:");
		int noOfCustomers =sc.nextInt();
		Customer [] customer=new Customer[noOfCustomers];
		
		for(int i=0;i<noOfCustomers;i++) {
			customer[i]=new Customer();
			customer[i].setCustomerDetails();
		}
		
		for(int i=0;i<noOfCustomers;i++) {
			customer[i].getCustomerDetails();
			
		}
		int choice;
		do {
			System.out.println("1.Display account details");
			System.out.println("2.Search by account number");
			System.out.println("3.Deposit the amount");
			System.out.println("4.Withdraw the amount");
			System.out.println("5.Exit");
			System.out.println("Enter your choice:");
			choice =sc.nextInt();
			switch (choice) {
			case 1:
				for(int i=0;i<noOfCustomers;i++) {
				customer[i].getCustomerDetails();
				}
				break;
			case 2:
				System.out.println("Enter the acc number:");
				int searchAccount=sc.nextInt();
				for(int i=0;i<noOfCustomers;i++) {
					if(customer[i].accno==searchAccount) {
						customer[i].getCustomerDetails();
						
					}
				}
				break;
			case 3:
				System.out.println("Enter the acc number:");
				searchAccount=sc.nextInt();
				try {
					System.out.println("Enter the amount to deposit:");
					int depositAmount=sc.nextInt();	
					if(depositAmount<0) {
						throw amountException;
				}
				else {
					
				    for(int i=0;i<noOfCustomers;i++) {
					if(customer[i].accno==searchAccount) {
						customer[i].accbalance=customer[i].accbalance+ depositAmount;
						customer[i].getCustomerDetails();
					}
				  }
				}
			  }
				catch(InvalidAmountException e) {
			}
				break;
			case 4:
				System.out.println("Enter the acc number:");
				searchAccount=sc.nextInt();
				try {
					System.out.println("Enter the amount to withdraw:");
					int withdrawAmount=sc.nextInt();	
					if(withdrawAmount<=0) {
						throw amountException;
				}
				else {
					for(int i=0;i<noOfCustomers;i++) {
					if(customer[i].accno==searchAccount) {
						if(withdrawAmount>customer[i].accbalance) {
							throw fundsException;
						}
						else {
						
						customer[i].accbalance=customer[i].accbalance - withdrawAmount;
						customer[i].getCustomerDetails();
					}
				  }
					}
				}
				}
				
				catch(InvalidAmountException e) {
			}
				default:
			}
		
		while(choice<5);
		}
	}
