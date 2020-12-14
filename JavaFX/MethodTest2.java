public class MethodTest2 {
  public static void main ( String[] args ) {
    hello("Tanaka");
    hello("Yamamoto");
    hello("Watanabe");
    hello("Yoshino");
	}

	public static void hello(String name){
		if (name.equals("Yoshino")) {
			System.out.println("Aloha "+name );
		}
		else{
		System.out.println ("Hello "+name +"!");
	}
	
}
}