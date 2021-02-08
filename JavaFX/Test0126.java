public class Test0126{
	public static void main(String[] args) {
		Alohaman am =new Alohaman();
		am.setName("Tanaka");
		am.setMsg("Aloha");
		am.sayAloha();

		Alohaman am2 =new Alohaman();
		am2.setName("Yamamoto");
		am2.setMsg("Aloha");
		am2.sayAloha();


	}
}

class Alohaman {

	private String msg,name;
	

	 public void setMsg( String data ) {
	 	this.msg = data;
	 }
	 public void setName( String data1 ) {
	 	this.name = data1;
	 }
	 public void sayAloha() {
	 	System.out.println( msg +","+name+"!" );
	 	//System.out.print( msg+","+ name2+"!" );
	 }
}
