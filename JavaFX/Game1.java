import java.util.Random;
import java.util.Scanner;

public class Game1 {
  public static void main ( String[] args ) {
    System.out.println("#### Number Game #### \n #### By Rony####");
    System.out.println("Do you want to play? \n 1.YES  2.NO");
    System.out.print( "your answer :" );

    Scanner sc=new Scanner(System.in);
    int answer = sc.nextInt();

    if (answer==1) {
    
    System.out.println("Ok..Let's play...");
    System.out.println();
    Random random = new Random();
    //Scanner sc=new Scanner(System.in);

    int i=0;

    while(true){
    	i++;
    int target = random.nextInt( 10 );
    System.out.print( "Enter Number :" );
    int Number = sc.nextInt();

    if(Number==target){
        System.out.println("Finaly..you win");
        //System.out.println("you win in "+number+" times");
        break;
    } else if(Number<target){
        System.out.println("Larger,try again");
    }
    else {
        System.out.println("Smaller,try again");
    }

    }
    }else {
        System.out.println();
        System.out.println("Thank you..Bye Bye..");
    }
}
}
