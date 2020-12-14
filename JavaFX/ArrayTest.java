import java.util.Scanner;
public class ArrayTest{
	public static void main(String[] args) {
	//String[] names = { "Yoshino", "Tanaka", "Yamamoto" };
		String password ="rony";

		//System.out.print("Enter password : ");
		Scanner sc=new Scanner(System.in);
		//String userData=sc.nextLine();
		
		/*String[] names=new String[3];
		for (int i=0;i<3; i++ ) {
		
		System.out.print("enter names : ");
		names[i]=sc.nextLine();
		}
		
		for(int i=0;i<3;i++){
			System.out.println(names[i]);

		}*/

		/*if(passwprd.equals(userData)){
			System.out.println("ok");
		}
		else{
			System.out.println("Invalid");

		}*/

		while(true){
		  System.out.print( "input password: " );
          String userData = sc.nextLine();
          
          if ( password.equals( userData ) ) {
            break;
        }
		}
	}
}