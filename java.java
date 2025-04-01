package Stringprograms;
import java.util.Scanner;
public class StringSegregation {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the String:");
      String str = sc.nextLine();
      
      String alphabets ="";
      String numbers ="";
      String SplChars ="";
      
      int sumOfAlphabets=0;
      int sumOfNumbers=0;
      int sumOfSpecialCh=0;
      
      for(int i=0; i<str.length(); i++) {
    	  if(str.charAt(i)>='A' && str.charAt(i)<='Z' || str.charAt(i)>='a' && str.charAt(i)<='z') {
    		  alphabets += (char) (str.charAt(i));
    		  sumOfAlphabets = sumOfAlphabets+str.charAt(i);
    	  }else if(str.charAt(i)>='0' && str.charAt(i)<='9') {
    		  numbers += str.charAt(i);
    		  sumOfNumbers = sumOfNumbers+str.charAt(i);
    	  }else {
    		  SplChars += (char) (str.charAt(i));
    		  sumOfSpecialCh = sumOfSpecialCh+str.charAt(i);
    	  }
    	  
      }
      System.out.println("The alphabets are:"+ alphabets);
      System.out.println("The sum of alphabets are:" +sumOfAlphabets);
      System.out.println("-------------------");
      
      System.out.println("The numbers are:"+ numbers);
      System.out.println("The sum of numbers are:"+sumOfNumbers ); 
      System.out.println("-------------------");

      System.out.println("The Special characters are:" +SplChars);
      System.out.println("The sum of special chars are:"+sumOfSpecialCh );
      System.out.println("-------------------");



	}

}
