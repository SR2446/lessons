public class Test3 {
    public static void main( String[] args ) {
      Person p = new Person( "Yoshino", "kawasaki", 57 );
      p.sayHello();
    }
  }
  
  // class Person;
    class Person {
      // data
      private String name;
      private String address;
      private int age;
      
      // method;  constructor & sayHello()
     public Person( String name, String address, int age ) {
     	int num = 0 ;
		if ( address.length() >= 5 ) {
		 	this.address = address;
		} else {
		 	System.out.println( " Error!! Addressの文字が少ない。。" );
		 	num = 1;
		}
		if( name.length() >= 4){  // Aoki
			this.name = name;
		} else {
			System.out.println( " Error!! Nameの文字が少ない。。" );
			num = 1;
		}
		if(age >= 15 ){
			this.age = age;
		} else {
			System.out.println( " Error!! 年齢が少ない" );
			num = 1;
		}
		if( num == 1 ){
			System.exit(1);
		}
	}
      
      public void sayHello(){
        String person = "My name is "+name+"."+"I am "+age+" years old."+"I live in "+address+".";
        System.out.println( person);
      }
    }