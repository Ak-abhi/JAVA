import java.util.*;

import GraphicsPackage.Circle;
import GraphicsPackage.Rectangle;
import GraphicsPackage.Square;
import GraphicsPackage.Triangle;
public class GraphicsPack {

	public static void main(String[] args) {
		boolean b=true;
		int ch;
		float r,l,br,a,h;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Menu:");
		System.out.println("1.Area of Circle:");
		System.out.println("2.Area of Rectangle:");
		System.out.println("3.Area of Square:");
		System.out.println("4.Area of Triangle:");
		System.out.println("5.Exit");
		
		while(b) {
			System.out.println("\nEnter your choice: ");
			ch=s.nextInt();
			
			switch(ch){
			case 1:
				System.out.print("Enter the radius of circle: ");
				r=s.nextFloat();
				Circle obj1=new Circle(r);
				break;
			case 2:
				System.out.print("Enter the length of rectangle: ");
				l=s.nextFloat();
				System.out.print("Enter the breadth of rectangle: ");
				br=s.nextFloat();
				Rectangle obj2=new Rectangle(l,br);
				break;
			case 3:
				System.out.print("Enter the side of square: ");
				a=s.nextFloat();
				Square obj3=new Square(a);
				break;
			case 4:
				System.out.print("Enter the base of triangle: ");
				br=s.nextFloat();
				System.out.print("Enter the height of triangle: ");
				h=s.nextFloat();
				Triangle obj4=new Triangle(br,h);
				break;
			case 5:
				b=false;
				break;
			}
		}
	}
}
