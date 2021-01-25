public class Aloha{
	public static void main(String[] args) {
		// String msg= args[0] ;
		// String msg1= args[2];
		// int num = Integer.parseInt(args[1]);
		aloha(args[0],args[1],args[2]);


	}


	public static void aloha(String dataNormal,String number,String dataSpecial){
		int num=Integer.parseInt(number);
		// System.out.println(dataNormal);
		// System.out.println(num);
		// System.out.println(dataSpecial);
		for (int i=0;i<num ;i++ ) {
			int n=i+1;
			
			if (i%5==0) {
				System.out.println( n +" "+ dataSpecial);
			}else{
				System.out.println( n +" "+ dataNormal);
			}
		}
	}

}