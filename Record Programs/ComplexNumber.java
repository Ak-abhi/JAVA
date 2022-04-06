import java.util.Scanner;
public class ComplexNumber{
	double real;
	double img;
	ComplexNumber(double real, double img){
		this.real=real;
		this.img=img;
	}
	ComplexNumber(){}
	ComplexNumber sum(ComplexNumber c1, ComplexNumber c2){
		ComplexNumber temp=new ComplexNumber();
			temp.real=c1.real+c2.real;
			temp.img=c1.img+c2.img;
			return temp;
	}
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter First complexnumber's real part:");
	double a=s.nextDouble();
	System.out.println("Enter First complexnumber's imaginary part:");
	double b=s.nextDouble();
	ComplexNumber c1=new ComplexNumber(a,b);
	System.out.println("Enter Second complexnumber's real part:");
	double c=s.nextDouble();
	System.out.println("Enter Second complexnumber's imaginary part:");
	double d=s.nextDouble();
	ComplexNumber c2=new ComplexNumber(c,d);
	ComplexNumber temp1=new ComplexNumber();
	temp1=temp1.sum(c1, c2);
	System.out.println("Sum is:"+temp1.real+ "+i" +temp1.img);
	}
}