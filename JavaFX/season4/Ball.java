import javafx.application.Application;
  import javafx.stage.Stage;
  import javafx.scene.Scene;
  import javafx.scene.layout.Pane;
  import javafx.scene.canvas.Canvas;
  import javafx.scene.canvas.GraphicsContext;
  import javafx.animation.AnimationTimer;
  import javafx.scene.paint.Color;

  public class Ball extends Application {
    // data
    private BreakoutThread breakoutthread;
    
    // method
    public static void main ( String[] args ) {
      launch( args );
    }
    
    @Override
    public void start( Stage stage ) {
      // settitle, pane, scene, setscene
      stage.setTitle( "BREAKOUT" );
      Pane pane = new Pane();
      Scene scene = new Scene( pane );
      stage.setScene( scene );
      
      // canvas, gc, add
      Canvas canvas = new Canvas( 640, 480 );
      GraphicsContext gc = canvas.getGraphicsContext2D();
      pane.getChildren().add( canvas );
      
      // breakoutthread, start
      breakoutthread = new BreakoutThread(gc);
      breakoutthread.start();
      
      // show
      stage.show();
    }
  }


  class BreakoutThread extends AnimationTimer {
    // data
    private GraphicsContext gc;

    // method
    BreakoutThread( GraphicsContext gc ){
      this.gc = gc;
     
    }
    
    @Override
    public void handle( long time ){      // 表示するメソッド
      // 画面表示を、ぜんぶ消す（きれいにする）
      gc.clearRect( 0, 0, 640, 480 );
      
     	int ball_x = 0;
     	int ball_y = 0;

      gc.setFill( Color.RED );
      // 表示する
      gc.fillOval( ball_x, ball_y, 20, 20 );
    }
   }

