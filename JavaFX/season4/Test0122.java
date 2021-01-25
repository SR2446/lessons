	import javafx.application.Application;
	import javafx.animation.TranslateTransition;
	import javafx.util.Duration;
	import javafx.stage.Stage;
	import javafx.scene.Scene;
	import javafx.scene.Group;
	import javafx.scene.paint.Color;
	import javafx.scene.shape.Circle;

	public class Test0122 extends Application {
	  public static void main ( String[] args ){
	  	launch( args );
	  }


	@Override
	public void start(Stage stage) throws Exception{
		
		//Group root=new Group();
		View v = new View();
		Scene scene= new Scene(v,500,400);

		// Circle circle= new Circle(200,200,80);
		// circle.setFill(Color.BLUE);

		//root.getChildren().add (circle);

		stage.setScene(scene);
		stage.show();

	}
}
	
	class View extends Group{
		public View(){

			Circle circle = new Circle(200,200,30);
			circle.setFill(Color.BLUE);

			TranslateTransition animation =new TranslateTransition(Duration.seconds(2),circle);
			animation.setFromX(50);
			animation.setFromY(400);
			animation.setToX(400);
			animation.setToY(100);

			animation.setCycleCount(animation.INDEFINITE );

			animation.play();
			getChildren().add( circle );
			}
	}