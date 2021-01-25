class Student {
	private String name;
	private String favorite;
}
	public void setName(String data){
			this.name=data;
		}
	public void sayHello(){
		System.out.println("Hell0!My name is"+this.name);
	}


	public void setFavorite(String like ){
		this.favorite = like ;

	}
	public void sayFavorite() {
        System.out.println( "I love " + this.favorite );
      }
public class Test1{
	public static void main(String[] args) {
		//System.out.println("hello");

		Student yamada =new Student();
		//yamada.name="yamada taro";
		yamada.setName("yamada taro");
		yamada.setFavorite("coffee");
		yamada.sayHello();
		yamada.sayFavorite();

		System.out.println(yamada.name);
		
		Student tanaka = new Student();
		//tanaka.name = "Tanaka Masahiko";
		tanaka.setName("Tanaka Masahiko");
		tanaka.setFavorite("matcha");
		tanaka.sayHello();
		tanaka.sayFavorite();

	}

}