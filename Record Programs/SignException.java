import java.io.IOException;
import java.util.Scanner;

class MyException extends Exception{
	public MyException(String str) {
		System.out.println(str);
	}
}

public class SignException {

	public static void main(String[] args) {
		System.out.println("Enter no. of input numbers: ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=0, sum=0;
		Integer myNumbers[]=new Integer[n];
		while(n>0) {
			try {
				System.out.println("Enter Numbers: ");
				int num=s.nextInt();
				if(num<0)
					throw new MyException("Number is negative!");
				else {
					myNumbers[k]=num;
					sum=sum+num;
					k++;
				}
				n--;
			}
			catch(MyException m) {
				System.out.println(m);
			}
		}
		System.out.println("The average is "+sum/k);

	}

}