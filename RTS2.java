import java.util.Scanner;

public class RTS2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan= new Scanner(System.in);
			
			System.out.println("Please input a number");
			int input=scan.nextInt();
			
			String str="MyString";
			String nwString=str.substring(str.length()-input) + str.substring(0,(str.length()-input));
			// rotate and appear
			// with str.length()-input, it will get from length-input to the end
			// add rest of string to back 
			
			System.out.println("Before : " +str);
			System.out.println("After : " +nwString);
			
			
	}
	

}
