import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Coupon {

    public static void couponGenerator(int range) {

        //array list to store the random numbers generated and to check they are unique
        ArrayList<Integer> arraylist = new ArrayList<>(range);

        int count = 0;

        //generating random numbers till the range
        while (count != range) {

            int randomNumber = ThreadLocalRandom.current().nextInt(0, 10000);

            if (!arraylist.contains(randomNumber)) {

                arraylist.add(randomNumber);
                count++;

            }

        }

        for (int i = 0; i < range; i++)
            System.out.println(arraylist.get(i));

    }

    //main method
    public static void main(String[] args) {
        
        // Get the input from the user
        System.out.println("Enter the number of coupons you want to generate: ");
        Scanner sc = new Scanner(System.in);

        int numberOfCoupons = sc.nextInt();
        System.out.println("The Coupons generated are : ");
        couponGenerator(numberOfCoupons);

    }
}
