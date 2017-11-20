package corehome;

import java.util.Scanner;

public class CoreHome {


	public static void main(String[] args) {
		
		CoreHome csh= new CoreHome();
		System.out.println("Select a number from 1,2");
		Scanner sc = new Scanner(System.in);
		int answer = sc.nextInt();
		sc.close();
		System.out.println("Your name is: "+csh.displayUser(answer));

	}

	public String displayUser(int userNo) {

		if (userNo == 1) {

			return "Mandar";
		} else if (userNo == 2) {
			return "John Doe";
		}
		else{
			return "Wrong Selection!";
		}
		

	}

}
