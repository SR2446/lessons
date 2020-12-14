import javafx.application.Application;
  import javafx.scene.Group;
  import javafx.scene.ParallelCamera;
  import javafx.scene.Scene;
 import javafx.scene.paint.Color;
  import javafx.scene.shape.Rectangle;
  import javafx.stage.Stage;
  
  public class Game01 extends Application {
    public static void main( String[] args ) {
      launch( args );
    }
     
    @Override
    public void start( Stage stage ) throws Exception {
      Group root = new Group();
      Scene scene = new Scene( root, 400, 300 );
      Rectangle rect01 = new Rectangle( 220, 125, 50, 50 );
      
      rect01.setFill( Color.RED );
      root.getChildren().add( rect01 );
      
      ParallelCamera cam = new ParallelCamera();
      //cam.setTranslateX( 100 );
      scene.setCamera( cam );
      
      stage.setScene( scene );
      stage.show();
    }
  }