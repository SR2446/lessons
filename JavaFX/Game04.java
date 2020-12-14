 import javafx.animation.Animation;
  import javafx.animation.TranslateTransition;
  import javafx.util.Duration;
  import javafx.application.Application;
  import javafx.stage.Stage;
  import javafx.scene.Scene;
  import javafx.scene.Group;
  import javafx.scene.shape.Rectangle;
  import javafx.scene.shape.Circle;
   
  public class Game04 extends Application{
   
  	public static void main(String[] args) {
  		launch(args);
  	}
   
  	@Override
  	public void start(Stage primaryStage) {
  		View v = new View();
  		Scene scene = new Scene(v, 400, 300);
  		primaryStage.setScene(scene);
  		primaryStage.show();
  	}
  }
  
  
  class View extends Group{
  	public View() {
      Circle circle = new Circle( 100, 100, 50);
  		Rectangle rect = new Rectangle(0,0,50,50);
  		TranslateTransition animation = new TranslateTransition(Duration.seconds(1), rect);
  		animation.setFromX(0);		
  		animation.setFromY(0);		
  		animation.setToX(350);		
  		animation.setToY(250);		
  		animation.setCycleCount( Animation.INDEFINITE );

      TranslateTransition animation1 = new TranslateTransition(Duration.seconds(1), circle);
      animation1.setFromX(350);    
      animation1.setFromY(250);    
      animation1.setToX(0);    
      animation1.setToY(0);    		
      animation1.setCycleCount( Animation.INDEFINITE );
  		
      // animation.setCycleCount(3);		
  		animation.setAutoReverse(true);	
      animation1.setAutoReverse(true);
  		// animation.setAutoReverse(false);
  		animation.play();
  		getChildren().add(rect);

      animation1.play();
      getChildren().add(circle);
  	}
  }
