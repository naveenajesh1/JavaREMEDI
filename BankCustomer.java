import java.util.Scanner;

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
	System.out.println("The customer details are:");
	System.out.println("Account number: "+ accno);
	System.out.println("Account type: "+ acctype);
	System.out.println("customer name: "+ name);
	System.out.println("Account balance: "+ accbalance);
	
}
}
public class BankCustomer {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
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

	}
}
