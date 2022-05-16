import java.util.*;
public class Shapes {
	void area(float a) {
		System.out.println("Area of square is "+(a*a));
	}
	void area(float l, float b) {
		System.out.println("Area of rectangle is "+(l*b));
	}
	void area(double r) {
		double z=3.14*r*r;
		System.out.println("Area of circle is "+z);
	}

	public static void main(String[] args) {
		int ch;
		boolean b=true;
		Scanner s=new Scanner(System.in);
		Shapes obj=new Shapes();
		System.out.println("Area of Shapes:");
		System.out.println("1-Area of Square");
		System.out.println("2-Area of Rectangle");
		System.out.println("3-Area of Circle");
		System.out.println("4-Exit");
		
		while(b) {
			System.out.println("\nEnter your choice: ");
			ch=s.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("Enter the side of the Square: ");
				float side=s.nextFloat();
				obj.area(side);
				break;
			case 2:
				System.out.println("Enter the length of the Rectangle: ");
				float len=s.nextFloat();
				System.out.println("Enter the breadth of the Rectangle: ");
				float bre=s.nextFloat();
				obj.area(len,bre);
				break;
			case 3:
				System.out.print("\nEnter radius of the Circle: ");
				double rad = s.nextDouble();
				obj.area(rad);
				break;
			case 4:
				b=false;
				break;
				
			}
		}
	}

}
