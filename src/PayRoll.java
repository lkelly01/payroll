import java.util.Scanner;

public class PayRoll {
	//FIELDS
	private String name;
	private int Id;
	private int hoursWorked;
	private double hourlyRate;
	
	
	//CONSTRUCOTR THAT ACCEPTS ARG
	public PayRoll(String name,int Id) {
		this.name = name;
		this.Id=Id;
	}
	
	//MUTATOR, ACCESSOR
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	//Get Gross Pay Method
	public double getGrossPay() {
		return hoursWorked*hourlyRate;
	}

	//MAIN,DEMONSTRATE
	public static void main(String[] args) {
		
	//ASK USER
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name:");
		String name=sc.next();
		System.out.println("Enter id:");
		int Id = sc.nextInt();
		System.out.println("enter hours worked:");
		int hoursWorked=sc.nextInt();
		System.out.println("enter hourly pay rate:");
		double hourlyRate=sc.nextDouble();
	//PAYROLL OBJECT
		PayRoll p = new PayRoll(name,Id);
		p.setHourlyRate(hourlyRate);
		p.setHoursWorked(hoursWorked);
		
	//PRINT,GRAB
		System.out.println("Gross pay is "+p.getGrossPay());
	}
}