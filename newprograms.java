import java.util.Scanner;
import java.util.*;

public class newprograms {

       public  static void main (String[] args) {
	    	int length = 4;
	    	System.out.println(OTP(length));
	       
	    }
	   public static char[] OTP(int len) {
		   System.out.println("Generating OTP : ");
		   System.out.print("Your OTP is ");
		   String numbers = "01234567890";
		   Random rd = new Random();
		   char otp[] = new char[len];
		   for(int i = 0;i<len;i++) {
			   otp[i] = numbers.charAt(rd.nextInt(numbers.length()));
			   
		   }
			return otp;
		}
}
