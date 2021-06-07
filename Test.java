import java.util.Scanner;

class Customer {
	private String name,email;
	private int age;
	private double creditlimit;
	
	public void acceptInfo()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter details name age email creditlimit");
		name=sc.next();
		age=sc.nextInt();
		email=sc.next();
		creditlimit=sc.nextDouble();
	}
	public void showDetails() {
		System.out.println("Name:" +name);
		System.out.println("Credit limit"+creditlimit);
	}
	public void setCreditLimit(double limit) {
		creditlimit=limit;
		
	}
	public double getCreditLimit() {
		return creditlimit;
	}
	

}

public class Test {
	public static void main(String[] args) {
		Customer c = new Customer();
		Customer c1 = new Customer();

		Scanner sc = new Scanner(System.in);

		c.acceptInfo();
		c.showDetails();

		Double limit;
		System.out.println("New creditlimit is");
		limit = sc.nextDouble();

		c1.acceptInfo();
		c1.setCreditLimit(limit);
		c1.showDetails();
		System.out.println("New credit limit is:" + c1.getCreditLimit());

	}

}


