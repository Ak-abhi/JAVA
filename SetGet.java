class Second{
	private int a;
	private int b;
	void set(int a1, int b1){
		a=a1;
		b=b1;
	}
	void get(){
		System.out.println("a="+a+" b="+b);
	}
}
class SetGet{
	public static void main(String args[]){
		Second sd=new Second();
		sd.set(5,10);
		sd.get();
	}
}