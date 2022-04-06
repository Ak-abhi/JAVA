class Second{
	int a;
	int b;
	void display(){
		System.out.println("Sum="+(a+b));
	}
}
class FirstClass{
	public static void main(String args[]){
		Second sd=new Second();
		sd.a=5;
		sd.b=10;
		sd.display();
	}
}