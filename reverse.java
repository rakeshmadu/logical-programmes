import java.util.*;
public class Reverse {

	//using reverse Method

	public void reverseMethod(int num) {
		int rever=0;
        	int remainder=0;

		while(num != 0) {
 	
        	remainder=num%10;
        	rever=rever*10+remainder;
        	num=num/10;
		}

	System.out.println(""+rever);

        }

	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);

	// Get input from User

	System.out.println("Enter the Number");
	int num=sc.nextInt();

	// creating object call from the class

	Reverse call=new Reverse();
	
	// Function calling
	
	call.reverseMethod(num);
	

	}
}
