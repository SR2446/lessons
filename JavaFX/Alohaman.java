public class Alohaman{
	public static void main(String[] args) {
		Alohaman am =new Alohaman();
		am.setMsg("Aloha");
		am.sayAloha();

	}
}

class Test {

	private String msg;

	 public void setMsg( String data ) {
	 	this.msg = data;
	 }
	 public void sayAloha() {
	 	System.out.println( msg );
	 }
}