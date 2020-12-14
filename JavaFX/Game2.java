import java.util.Scanner;

public class Game2 {
  public static void main ( String[] args ) {
    System.out.println("#### Quiz Game #### \n #### By Rony####");
    System.out.println("Do you want to play? \n 1.YES  2.NO");
    System.out.print( "your answer :" );

    Scanner sc=new Scanner(System.in);
    int answer = sc.nextInt();
    if (answer==1) {
    
    System.out.println("Ok..Let's play...");
    System.out.println();
    int num =0;

    System.out.println("Q.1 How many students in our class?");
    System.out.println("  1.20  2.19  3.24");
    System.out.print( "Enter Answer :" );
    int  Answer = sc.nextInt();
    if (Answer==2){
    	num=num+1;
    	System.out.println("Answer is Right...");
    }else{
    	System.out.println("Wrong!! Right Answer: 2.19");
    }

    System.out.println("Q.2 Whice teacher is in charge of our class?");
    System.out.println("  1.Tanaka  2.Yoshino  3.Yamamoto");
    System.out.print( "Enter Answer :" );
     Answer = sc.nextInt();
    if (Answer==1){
    	num=num+1;
    	System.out.println("Answer is Right...");
    }else{
    	System.out.println("Wrong!! Right Answer: 1. Tanaka Sensei");
    }
    System.out.println("Q.1 How old is Tanaka Sensei?");
    System.out.println("  1.53  2.55  3.57");
    System.out.print( "Enter Answer :" );
     Answer = sc.nextInt();
    if (Answer==2){
    	num=num+1;
    	System.out.println("Answer is Right...");
    }else{
    	System.out.println("Wrong!! Right Answer: 2.55");

	}
	System.out.println();
   System.out.println("You get "+num+ " out of 3.");
	}else {
        System.out.println();
        System.out.println("Thank you..Bye Bye..");
    }

  }
}
