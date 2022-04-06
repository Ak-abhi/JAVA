class A{
	int a;
	int b;
	int area(int a){
		this.a=a;
		return(a*a);
	}
	int area(int a, int b){
		this.a=a;
		this.b=b;
		return(a*b);
	}
	void display(){
		System.out.println("Area of square="+ area(5));
		System.out.println("Area of rectangle="+ area(5,10));
	}
}
class Area{
	public static void main(String args[]){
		A obj1=new A();
		obj1.display();
	}
}