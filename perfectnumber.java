import java.util.*;
public class Perfect  {
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	// get input from user

	System.out.println("Enter the number");
	int num=sc.nextInt();
	int sum=0;

	for (int i = 1; i < num; i++) {
		while (num % i == 0) {
				System.out.println(i);
				sum=sum+i;
				break;
			
		}
	}

	// check sum of its divisor equal to the input number
	
	if (num == sum) {
		System.out.println(num+" is a Perfect Number");
	}
	else
 		System.out.println(num+" is Not a Perfect Number");

	
	}
}
