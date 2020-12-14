 import javafx.application.Application;
  import javafx.stage.Stage;
  import javafx.scene.Scene;
  import javafx.scene.control.Label;
  import javafx.scene.layout.BorderPane;
   
   public class TestFX1 extends Application {
     public static void main( String[] args ) {
       launch( args );
     }
     
     @Override
     public void start( Stage stage ) throws Exception {
      Label label = new Label("Hello,JavaFX!");
      Label label1 = new Label("ロニー");
      Label label2 = new Label("IG12");

      BorderPane pane = new BorderPane();
      pane.setTop(label);
      pane.setCenter(label1);
      pane.setBottom(label2);


      Scene scene = new Scene(pane,320,240);
      stage.setScene(scene); 
       stage.show();
     }
   }