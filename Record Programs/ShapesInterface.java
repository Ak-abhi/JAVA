import java.util.*;

interface Prototype{
	void Area();
	void Perimeter();
}

class Circle implements Prototype{
	float r;
	double pi=3.14, z;
	Circle(float r){
		this.r=r;
	}
	public void Area() {
		z=(pi*r*r);
		System.out.println("Area of circle is :"+(z));
	}
	public void Perimeter() {
		z=(2*pi*r);
		System.out.println("Perimeter of circle is: "+(z));
	}
}

class Rectangle implements Prototype{
	int l,b;
	double z;
	Rectangle(int l, int b){
		this.l=l;
		this.b=b;
	}
	public void Area() {
		z=(l*b);
		System.out.println("Area of Reactangle is:"+(z));
	}
	public void Perimeter() {
		z=2*(l+b);
		System.out.println("Perimeter of Rectangle:"+(z));
	}
}
public class ShapesInterface {

	public static void main(String[] args) {
		int ch;
		boolean b=true;
		Scanner s=new Scanner(System.in);
		System.out.println("Menu:");
		System.out.println("1.Area and Perimeter of Circle");
		System.out.println("2.Area and Perimeter of Rectangle");
		System.out.println("3.Exit");
		
		while(b) {
			System.out.println("\nEnter your choice: ");
			ch=s.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("Enter the radius of the circle: ");
				float r=s.nextFloat();
				Prototype obj1=new Circle(r);
				obj1.Area();
				obj1.Perimeter();
				break;
			case 2:
				System.out.println("Enter the length of the rectangle: ");
				int len=s.nextInt();
				System.out.println("Enter the breadth of the rectangle: ");
				int bre=s.nextInt();
				Prototype obj2=new Rectangle(len,bre);
				obj2.Area();
				obj2.Perimeter();
				break;
			case 3:
				b=false;
				break;
			}
		}
	}
}
