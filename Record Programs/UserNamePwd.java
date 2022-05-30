import java.util.Scanner;
import java.lang.Exception;

class UserNameException extends Exception{
	UserNameException(String msg){
		System.out.println(msg);
	}
}

class PwdException extends Exception{
	PwdException(String msg){
		System.out.println(msg);
	}
}

public class UserNamePwd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String username, password;
		System.out.println("Enter Username: ");
		username=s.nextLine();
		System.out.println("Enter Password: ");
		password=s.nextLine();
		int len=username.length();
		try {
			if(len<8)
				throw new UserNameException("Username must be greate than 8 characters\n");
			else if(!password.equals("admin"))
				throw new PwdException("Incorrect password\n");
			else
				System.out.println("Successfully logged in!");
		}
		catch(UserNameException u) {
			System.out.println(u);
		}
		catch(PwdException p) {
			System.out.println(p);
		}
	}

}
