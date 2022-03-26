class Consonant{
	public static void main(String args[]){
		char con='b';
		int flag=0;
		char vowel[]={'a','e','i','o','u'};
		for(int i=0;i<5;i++){
			if(vowel[i]==con){
				System.out.println("The alphabet is vowel");
				flag=1;
			}
		}
		if(flag==0){
			System.out.println("The alphabet is consonant");
		}
	}
}