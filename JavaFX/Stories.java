import java.util.Random;
   
   public class Stories {
     public static void main ( String[] args ) {
       // randomをつくる
       Random random = new Random();
       
       // データをつくる
       String[] subjects = { "Ronyさんは", "Bisnoさんは", "Ikbalさんは" };
       String[] places = { "　コンビニで", "　レストランで", "ヤマトで" };
       String[] done = { " アルバイトやっています.", " 仕事やっています.", " 働いています." };
       
       // だれが、どこで、なにした、をつくって表示する
       String story = "";
       int num = random.nextInt(3);
       story = story + subjects[ num ];		// だれが
       
       num = random.nextInt(3);
       story = story + places[ num ];			// どこで
       
       num = random.nextInt(3);
       story = story + done[ num ];			// なにした
       
       System.out.println( story );
     }
   }