import java.util.*;
class Matrix{
	int m,n,p,q,i,j;
	int a[][]=new int[20][20];
	int b[][]=new int[20][20];
	int c[][]=new int[20][20];
	Scanner s=new Scanner(System.in);
	void add(){
		System.out.println("\nEnter the limit of first matrix : ");
		m=s.nextInt();
		n=s.nextInt();
		System.out.println("\nEnter the limit of second matrix : ");
		p=s.nextInt();
		q=s.nextInt();

		if(m==p &&n==q){
			System.out.println("\nEnter the elements of First Matrix:");
			for(i=0;i<m;i++){
				for(j=0;j<n;j++){
					a[i][j]=s.nextInt();
				}
			}
			System.out.println("\nEnter the elements of First Matrix:");
			for(i=0;i<m;i++){
				for(j=0;j<n;j++){
					b[i][j]=s.nextInt();
				}
			}
			System.out.println("\nFirst matrix ");
			for(i=0;i<m;i++){
			System.out.println();
				for(j=0;j<n;j++){
					System.out.print(a[i][j]+"\t");
				}
			}
			System.out.println("\nSecond matrix ");
			for(i=0;i<p;i++){
			System.out.println();
				for(j=0;j<q;j++){
					System.out.print(b[i][j]+"\t");
				}
			}
			System.out.println("\nAfter Addition the maxtrix is \n");
			for(i=0;i<m;i++){
				for(j=0;j<n;j++){
					c[i][j]=a[i][j]+b[i][j];
				}
			}
			for(i=0;i<m;i++){
			System.out.println();
				for(j=0;j<n;j++){
					System.out.print(c[i][j]+"\t");
				}
			}
		}
		else{
			System.out.println("\nAddition cannot be performed");
			}
		}
	}
class MatrixAddition{
	public static void main(String args[]){
		Matrix mobj=new Matrix();
		mobj.add();
	}
}
