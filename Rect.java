class Rect1{
	int l;
	int b;
	Rect1(){
		l=10;
		b=15;
	}
void display(){
	System.out.println("Area="+(l*b));
	}
}
class Rect{
	public static void main(String args[]){
		Rect1 Robj=new Rect1();
		Robj.display();
	}
}