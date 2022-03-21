class Large{
	public static void main(String args[]){
		int a=50;
		int b=20;
		int c=30;
		if(a>b && a>c){
			System.out.println("The largest number is:"+a);
		}
		else if(b>a && b>c){
			System.out.println("The largest number is:"+b);
		}
		else if(c>a && c>b){
			System.out.println("The largest number is:"+c);
		}
	}
}