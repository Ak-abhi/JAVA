class Armstrong{
	public static void main(String args[]){
		int num=153,temp,d;
		int sum=0;
		temp=num;
		while(temp>0){
			d=temp%10;
			sum=sum+d*d*d;
			temp=temp/10;
			}
		if(num==sum){
			System.out.println(num+" is an armstrong number");
			}
		else{
			System.out.println(num+" is not an armstrong number");
			}
		}
	}