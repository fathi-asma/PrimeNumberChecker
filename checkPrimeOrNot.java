import java.util.Scanner;
public class checkPrimeOrNot{
	public static void main(String args[]){
	Scanner input=new Scanner(System.in);

	        System.out.print("Enter the number :");
	   	int number=input.nextInt();

		if (number<0) {
		System.out.println("Enter the non negative number:");
	       } else {	
		int factorcounter=0;

                for(int j=1; j<=number; j++){
                if(number%j==0) {
                factorcounter++;
	       }
           }
   System.out.println("Number: "+ number);
   System.out.println("Factor counte:"+factorcounter);

  if (number==0|| number ==1) {
	System.out.println("Status : not a primary number");
 } else if(factorcounter==2) {
	System.out.println("Status : primary number");
} else {
	System.out.println("Status : not a primary number");
	}
 } 
input.close();
	}
}

				