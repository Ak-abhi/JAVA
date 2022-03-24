import java.util.*;
class TwoD{
	public static void main(String args[]){
		int a[][]=new int[2][3];
		int i,j;
		Scanner input=new Scanner(System.in);
		for(i=0;i<a.length;i++){
			for(j=0;j<a[0].length;j++){
				a[i][j]=input.nextInt();
			}
		}
		System.out.println("Output Matrix: ");
		for(i=0;i<a.length;i++){
			System.out.println();
			for(j=0;j<a[0].length;j++){
				System.out.println(a[i][j]+ " ");
			}
		}
	}
}