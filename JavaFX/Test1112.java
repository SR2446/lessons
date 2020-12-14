import javafx.application.Application;
  import javafx.stage.Stage;
  import javafx.scene.Scene;
  import javafx.scene.Group;
  import javafx.scene.ParallelCamera;
  import javafx.scene.paint.Color;
  import javafx.scene.shape.Rectangle;

   public class Test1112 extends Application {
    public static void main( String[] args ) {
      launch(args);      
    }
    
    @Override
    public void start( Stage stage ) throws Exception {
      // Group, Sceneをつくる
      Group root = new Group();
      Scene scene = new Scene( root, 400, 300 );
      
      // □をつくる
      Rectangle rect = new Rectangle( 200, 100, 60, 60 );
      
      // □に色をつける
      rect.setFill( Color.GREEN );
      rect.setFill( Color.rgb( 0, 255, 0 ) );
      
      // □をGroupに入れる
      root.getChildren().add( rect );
      
      // 表示する
      stage.setScene( scene );
      stage.show();
    }
  }