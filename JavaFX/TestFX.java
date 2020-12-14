
import javafx.application.Application;
  import javafx.stage.Stage;
  import javafx.scene.Scene;
  import javafx.scene.control.Label;
  import javafx.scene.layout.BorderPane;
  import javafx.scene.Group;
  import javafx.scene.image.Image;
  import javafx.scene.image.ImageView;
  import javafx.scene.layout.HBox;
  import javafx.scene.paint.Color;
  
  public class TestFX extends Application {
    public static void main ( String[] args ) {
      launch( args );
    }
    
    @Override
    public void start( Stage stage ) throws Exception {
    /*	Label label = new Label("ALOHA");

    	BorderPane pane = new BorderPane();
    	pane.setCenter(label);


    	Scene scene = new Scene(pane,320,240);
    	stage.setScene(scene); 

      stage.show();*/
      Image image = new Image("a1.jpg");
   
           
           ImageView iv1 = new ImageView();
           iv1.setImage(image);
  
  		
           Group root = new Group();
           Scene scene = new Scene(root);
           scene.setFill(Color.BLACK);
           HBox box = new HBox();
           box.getChildren().add(iv1);
           root.getChildren().add(box);
   
   		
           stage.setTitle("ImageView");
           stage.setWidth(200);
           stage.setHeight(100);
           stage.setScene(scene); 
           stage.sizeToScene(); 
           stage.show(); 
    }
  }