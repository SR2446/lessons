import java.util.Random;
import java.util.Scanner;

public class Random {
  public static void main ( String[] args ) {
    

    Random random = new Random();
    int target = random.nextInt();
    
    Scanner sc=new Scanner(System.in);
    System.out.print( "your answer :" );
    int answer = sc.nextInt();

    if(answer==target){
        System.out.println("you win");
    }else{
        System.out.println("you lose..."+"Target:"+target);
    }
  }
}
