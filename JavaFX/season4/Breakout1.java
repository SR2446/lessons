import javafx.application.Application;
  import javafx.stage.Stage;
  import javafx.scene.Scene;
  import javafx.scene.layout.Pane;
  import javafx.scene.canvas.Canvas;
  import javafx.scene.canvas.GraphicsContext;
  import javafx.animation.AnimationTimer;
  import javafx.scene.paint.Color;

  public class Breakout1 extends Application {
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

    private GraphicsContext gc;
    private Ball ball;
    private Bar bar;


    BreakoutThread( GraphicsContext gc ){
      this.gc = gc;
      this.bar = new Bar();

      ball = new Ball();
    }
    
    @Override
    public void handle( long time ){
      gc.clearRect( 0, 0, 640, 480 );

      ball.draw( gc );
      ball.move();
      bar.draw(gc);
    }
  }

  class Ball {

    private int x;
    private int y;
    private int x_speed;
    private int y_speed;
    private int size;

    public Ball() {

      x = 0;
      y = 0;
      x_speed = 2;
      y_speed = 2;
      size = 20;
    }
    
    public void draw( GraphicsContext gc ) {

      gc.setFill( Color.BLUE );

      gc.fillOval( x, y, size,size );
    }

    public void move() {

      // x += 2;
      // y += 2;

      x += x_speed;
      y += y_speed;

      if (x > 640-size ) {
        x_speed *= -1;
      }
      if (y < 0) {
        y_speed *= -1;
      }
      if (x < 0 ) {
        x_speed *= -1;
      }
      if (y > 480-size ) {
        y_speed *= -1;
      }
  }
}
    class Bar {
    // data
    private int x;
    private int y;
    private int w;
    private int h;
    private int x_speed;
    private int y_speed;
    
    // method
    public Bar(){
      x = 50;
      y = 450;
      w = 100;
      h = 20;
    }
    
    public void draw( GraphicsContext gc ){
      gc.setFill( Color.RED );
      gc.fillRect( x, y, w, h );
    }
  }
