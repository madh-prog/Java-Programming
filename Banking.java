import java.util.Scanner;

public class Banking extends AmountWithdraw {

      public static void main(String[] args) {
    	  int ch;
    	  @SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
          do
          {
	         System.out.println("Enter your choice no:");
	        
	          System.out.println("1. adduser");
	         System.out.println("2. viewUser");
	        System.out.println("3. Deposite");
            System.out.println("4. Withdraw");
            System.out.println("5. checkBalance");
	        System.out.println("6. Exit");
	        ch =sc.nextInt();
	       AmountWithdraw o1=new AmountWithdraw();
	        switch(ch)
	   {
	    case 1:
	     o1.addUser();
	    break;
	    case 2:
	    o1.viewUser();
	    break;
	    case 3:
	     o1.deposite();
	    break;
	    case 4:
	    try
           {
           o1.withdraw();
           }
           catch(ArithmeticException ae)
           {
            System.out.println("You have entered negative value");
            ae.printStackTrace();
           }
	    break;
	    case 5 :
	    	o1.checkBalance();
	   break;
	    case 6:
	    	return;
	   }     
       }while(ch!=6);
   }
}

