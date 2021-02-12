import java.util.Scanner;
public class Test5{
	public static void main(String[] args) {


		System.out.println("Your name,plase?");
		Scanner sc=new Scanner(System.in);
		System.out.print("Name : ");
		String name=sc.nextLine();
		System.out.println("You name is "+name+".");


		System.out.println("how old are you?");
		System.out.print("Age : ");
		String age=sc.nextLine();
		System.out.println("You are "+age+" years old.");

		System.out.println("Where do you live?");
		System.out.print("Address : ");
		String address=sc.nextLine();
		System.out.println("You live in  "+address);

		System.out.println("Do you like Movies? \n 1. Yes 2. No");
		System.out.print("Answer : ");
		//int answer=sc.nextInt();
		String answerString = sc.nextLine();
		int answer = Integer.parseInt(answerString);

		if( answer == 1){
		System.out.println("So,You like movies.");
		}else{
			System.out.println("OK..Then,what do you like? n 1. Music 2. Books");
			System.out.print("Answer : ");
			//int reply=sc.nextInt();
			String replyString = sc.nextLine();
			int reply = Integer.parseInt(replyString);
			if ( reply == 1) {
				System.out.println("What kind of Music you like?");
				System.out.print("Music : ");
				String likemusic=sc.nextLine();

				System.out.println("You like "+likemusic+" musics.");
			}else{
				System.out.println("What kind of Book you like?");
				System.out.print("Book : ");
				String likebook=sc.nextLine();

				System.out.println("You like "+likebook+" book.");

			}
		}



	}
}  