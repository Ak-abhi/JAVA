import java.util.*;

class Person{
	String name, gender, address;
	int age;
	Person(String name, String gender, String address, int age){
		this.name=name;
		this.gender=gender;
		this.address=address;
		this.age=age;
	}
	void display() {
		System.out.println("Name: "+name+", Gender: " +gender+ ", Address: " +address+ " and Age "+age);
	}
}

class Employeee extends Person{
	String company_name, qualification, salary;
	int empid;
	Employeee(String name,String gender,String address,int age,
			String company_name,String qualification,String salary,int empid){
		super(name,gender,address,age);
		this.company_name = company_name;
		this.qualification = qualification;
		this.salary = salary;
		this.empid = empid;
	}
	void display() {
		super.display();
		System.out.println("Company_name: " +company_name+ ", Qualification: " +qualification+ ", Salary: " +salary+ " and Empid "+empid);
	}
}

class Teacher extends Employeee{
	String subject, department;
	int tid;
	Teacher(String name,String gender,String address,int age,String company_name,
			String qualification,String salary,int empid,String subject,String department,int tid){
		super(name,gender,address,age,company_name,qualification,salary,empid);
		this.subject=subject;
		this.department=department;
		this.tid=tid;
	}
	void display() {
		super.display();
		System.out.println("Subject: " +subject+ ", Department: "+ department+ " and Teacherid: " +tid);
	}
}

public class Inheritance{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the No. of Teachers: ");
		int n=s.nextInt();
		Teacher[] obj=new Teacher[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("Enter Name: ");
			String name=s.next();
			
			System.out.print("Enter Age: ");
			int age=s.nextInt();
			
			System.out.print("Enter Gender: ");
			String gender=s.next();
			
			System.out.print("Enter Address: ");
			String address=s.next();
			
			
			System.out.print("Enter Employee Company_name: ");
			String company_name=s.next();
			
			System.out.print("Enter Employee id: ");
			int empid=s.nextInt();
			
			System.out.print("Enter Employee Qualification: ");
			String qualification=s.next();
			
			System.out.print("Enter Employee Salary : ");
			String salary=s.next();
			
			
			System.out.print("Enter TeacherID: ");
			int tid = s.nextInt();
			
			System.out.print("Enter Teacher Subject: ");
			String subject=s.next();
			
			System.out.print("Enter Teacher Department : ");
			String department=s.next();
			
			
			obj[i] = new Teacher(name,gender,address,age,company_name,qualification,salary,empid,subject,department,tid);
		}
		for(int i=0;i<n;i++) {
			obj[i].display();
		}
	}
}