import java.util.*;
class Product{
	int pcode;
	String pname;
	int price;
	Product(){
		pcode=1;
		pname="Sanitizer";
		price=50;
	}
	Product(int pcode, String pname, int price){
		this.pcode=pcode;
		this.pname=pname;
		this.price=price;
	}
	void display(){
		System.out.println("\n Pcode=" +pcode+"\n Name=" +pname+"\n Price=" +price);
	}
}
class ProductCp{
	public static void main(String args[]){
		Product p1=new Product();
		Product p2=new Product(2, "Mask", 25);
		System.out.println("First product");
		p1.display();
		System.out.println("\nSecond product");
		p2.display();
		Scanner s=new Scanner(System.in);
		System.out.println("\nEnter the Third product's code, name and price:");
		int pcode=s.nextInt();
		String pname=s.next();
		pname+=s.nextLine();
		int price=s.nextInt();
		System.out.println("Third product");
		Product p3=new Product(pcode, pname, price);
		p3.display();
		
		if(p1.price<p2.price && p1.price<p3.price){
			System.out.println("Product having lowest price is" +p1.pname);
		}
		else if(p2.price<p1.price && p2.price<p3.price){
			System.out.println("Product having lowest price is" +p2.pname);
		}
		else{
			System.out.println("Product having lowest price is" +p3.pname);
		}
	}
}
