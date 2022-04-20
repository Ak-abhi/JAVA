import java.util.Scanner;

public class StringManipulations {

	public static void main(String[] args) {
		int i,ch;
		Scanner s=new Scanner(System.in);
		String s1=new String();
		System.out.println("Enter the String:");
		s1=s.next();
		s1+=s.nextLine();
		System.out.println("MENU:\n1.String Length\n2.String Concatenation\n3.Character Extraction\n4.String Comparison\n5.Searching Substrings\n6.Modifying a String\n7.Exit");
		do {
			System.out.println("Enter your choice:");
			ch=s.nextInt();
			switch(ch) {
			case 1:
				System.out.println("System length: "+s1.length());
				break;
			case 2:
				System.out.println("Enter the string to concatenate:");
				String s2=new String();
				s2=s.next();
				System.out.println("Strings after concatenation: "+s1.concat(s2));
				break;
			case 3:
				System.out.println("Enter the position of the character:");
				int p;
				p=s.nextInt();
				System.out.println("Character at given position is "+s1.charAt(p));
				break;
			case 4:
				System.out.println("Enter the string to be compared:");
				String s3=new String();
				s3=s.next();
				s3+=s.nextLine();
				boolean res=s1.equals(s3);
				System.out.println("Is the two strings "+s1+" and "+s3+" are equal? "+res);
				break;
			case 5:
				System.out.println("Searching for substrings:");
				String a1=new String();
				a1=s.next();
				int lastIndex=s1.lastIndexOf(a1);
				int firstIndex=s1.indexOf(a1,2);
				System.out.println("Last Index "+lastIndex+" First Index "+firstIndex);
				break;
			case 6:
				System.out.println("Enter the string to be replaced:");
				String s4=new String();
				s4=s.next();
				System.out.println("Enter the string for replacing: ");
				String s5=new String();
				s5=s.next();
				String replace_string=s1.replace(s4,s5);
				System.out.println("The string after replace : "+replace_string);
				break;
			case 7:
				System.out.println("Exiting...");
				System.exit(0);
			default:
				System.out.println("Invalid choice!");
				break;
				
			}
		}
		while(ch!=8);
	}

}
