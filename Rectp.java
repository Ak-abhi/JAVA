class Rect1{
	int l;
	int b;
	Rect1(int l1, int b1){
		l=l1;
		b=b1;
	}
void display(){
	System.out.println("Area="+(l*b));
	}
}
class Rectp{
	public static void main(String args[]){
		Rect1 Robj=new Rect1(5,10);
		Robj.display();
	}
}