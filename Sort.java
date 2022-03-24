import java.util.*;
class Sort{
	public static void main(String args[]){
		int a[]=new int[5];
		int temp,i,j;
		Scanner input=new Scanner(System.in);
		for(i=0;i<a.length;i++){
			a[i]=input.nextInt();
		}
		for(i=0;i<(a.length-1);i++){
			for(j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Sorted list is:");
		for(i=0;i<5;i++){
			System.out.println(a[i]+" ");
		}
	}
}