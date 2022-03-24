import java.util.*;
class Arrln{
	public static void main(String args[]){
		int a[]=new int[10];
		Scanner input=new Scanner(System.in);
		for(int i=0;i<a.length;i++){
			a[i]=input.nextInt();
		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}