import java.util.Scanner;

public class RTS1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int [] arr= {1,5,2,1,10};
		
		System.out.println("Please input a number");
		int input=scan.nextInt();
		
		int above=0;
		int below=0;
		
		
		for(int i=0; i<arr.length; i++) {
			if(input<arr[i]) {
				above+=1;
				System.out.println(arr[i]);
			}
			if(input>arr[i]) {
				below+=1;
			}
		}
		//we need check every element in the array
		//using for loop and look for array elements
		//use two if one for above, one for below 
		
		System.out.println("Above: " + above + " Below: " +below );
		
	}
}
