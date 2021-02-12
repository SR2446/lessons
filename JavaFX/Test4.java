public class Test4{
    public static void main( String[] args ) {
      Person p = new Person( "Yoshino", "kawasaki", 57 ,"Action movie" );
      p.sayHello();
    }
  }
  
  // class Person;
    class Person {
      // data
      private String name;
      private String address;
      private int age;
      private int num = 0;
      private boolean movie;
      
      // method;  constructor & sayHello()
     public Person( String name, String address, int age,boolean movie ) {
		setName( name );
		setAddress( address );
		setAge( age );
		setMovie( movie );


		if ( this.num == 1 ) {
		 System.exit(1);
		}
	}
	 public void setName( String data ) {
		if ( data.length() >= 4 ) {
		 this.name = data;
		} else {
		 handleError( "name" );
		}
	 }
	 public void setAddress( String data ){
		if( data.length() >= 5 ){
		this.address = data ;
		} else {
		 handleError( "address" );
		}
	 }
	 public void setAge ( int data ){
		if( data >= 15 ){

		 this.age = data ;
		} else {
		handleError( "Age" );
		}
	 }
 	 public void setMovie (boolean data ){
 	 	if( data == true){
 	 		this.movie = data;
 	 	}else{
 	 		handleError( "Movie");
 	 	}
 	 }
     public void handleError( String data ) {
      this.num = 1;
      System.out.println( data + "のデータに問題あります。" );
    }

      public void sayHello(){
        String person = "My name is "+name+"."+"I am "+age+" years old."+"I live in "+address+"."+"I like "+movie+".";
        System.out.println( person);
      }
    }