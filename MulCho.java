import java.util.*;
class MulCho{
	public static void main(String args[]){
		char[][] test={
				{'D','B','A','C','B'},
				{'A','B','C','A','A'},
				{'B','B','C','A','B'},
				{'D','D','A','C','B'},
				{'D','C','B','A','A'}
				};
		char key[]={'D','C','B','A','B'};
		int i,j;
		int correctans=0;
		for(i=0;i<test.length;i++){
			for(j=0;j<test[i].length;j++){
				if(test[i][j]==key[j]){
					correctans=correctans+1;
				}
			}
			System.out.println("Score of student"+(i+1) + " is: " + correctans);
		}
	}
}