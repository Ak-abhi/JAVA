import java.util.*;
class EmployeeInfo{
	int eno;
	String ename;
	float esalary;
	
	public void input() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Employee number: ");
		this.eno=s.nextInt();
		System.out.println("Enter Name: ");
		this.ename=s.next();
		ename+=s.nextLine();
		System.out.println("Emter the salary: ");
		this.esalary=s.nextFloat();
	}
	
	void display() {
		System.out.println("Employee Number: "+eno);
		System.out.println("Name: "+ename);
		System.out.println("Salary: "+esalary);
	}
}
public class Employee {

	public static void main(String[] args) {
		int a=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of employees:");
		int n=s.nextInt();
		EmployeeInfo e[]=new EmployeeInfo[n];
		for(int i=0;i<n;i++) {
			e[i]=new EmployeeInfo();
			e[i].input();
			System.out.println();
		}
		System.out.println("Details:");
		for(int i=0;i<n;i++) {
			e[i].display();
			System.out.println();
		}
		System.out.println("Enter the Employee Number for details: ");
		int empno=s.nextInt();
		for(int i=0;i<n;i++) {
			if(e[i].eno==empno) {
			e[i].display();
			System.out.println();
			a=1;
			}
		}		
		if(a!=1) {
		System.out.println("Employee does not exists!");
		}
	}
}
