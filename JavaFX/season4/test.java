import javafx.animation.Animation;
   import javafx.animation.ScaleTransition;
   import javafx.util.Duration;
   import javafx.application.Application;
   import javafx.stage.Stage;
   import javafx.scene.Scene;
   import javafx.scene.Group;
   import javafx.scene.paint.Color;
   import javafx.scene.shape.Rectangle;
   
   public class Test extends Application {
     // main()
     public static void main( String[] args ) {
       launch( args );
     }
     
     // start()
     @Override
     public void start( Stage stage ) {
       View v = new View();
       Scene scene = new Scene( v, 400, 300 );
       stage.setScene( scene );
       stage.show();

      // scene.setOnMouseClicked( e -> System.out.println("hello"));
       scene.setOnMouseClicked( e -> v.change() );
       // scene.setOnMouseClicked( e -> v.changeColor() );
     }
   }
   
   class View extends Group {

    Rectangle rect;
    ScaleTransition animation;
     int flagColor = 0;
    int flagAnimation = 0;
     // constructor
     public View() {
       // shape, color
       rect = new Rectangle( 0, 0, 50, 40 );
       rect.setFill( Color.CYAN );
       

       // animation, setcyclecount, setautoreverse
        animation = new ScaleTransition( Duration.seconds( 2 ), rect );
       animation.setFromX( 1 );
       animation.setFromY( 1 );
       animation.setToX( 5 );
       animation.setToY( 5 );
       animation.setCycleCount( Animation.INDEFINITE );
       animation.setAutoReverse( true );
       
       // play, add
       animation.play();
       getChildren().add( rect );
     }

     public void changeColor(){
        if (flagColor == 0){
          rect.setFill( Color.RED);
          flagColor = 1;
        }else{
          rect.setFill( Color.CYAN);
          flagColor = 0;
     }
   }

      public void changeAnimation(){
        if (flagAnimation == 0){
          animation.pause();
          flagAnimation = 1;
        }else{
          animation.play();
          flagAnimation = 0;
        }
      }

      public void change(){
        changeAnimation();
        changeColor();
      }

   }