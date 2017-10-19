
import java.awt.Point;

public class Balls {
    private Point[] ball;
    
    public Balls(int size) {
        this.ball = new Point[size];
        for (int i = 0; i < ball.length; i++) {
            this.ball[i] = new Point(0,0);
        }
    }
    
    public Balls(Point ball[]) {
        this(ball.length);
    }

    public Balls(Balls b) {
        this(b.ball);
    }

    public void translate(int dx, int dy) {
        for( int i = 0; i < this.ball.length; i++) 
            this.ball[i].translate(dx,dy) ;
    }
       
    void reInit() {
        for( int i = 0; i < this.ball.length; i++) 
            this.ball[i].move(0,0) ;
    }

    @Override    
    public String toString() {
        String s = new String();
        for (int i = 0; i < this.ball.length ; i++)
            s += "Ball n°" + i + ": x=" + this.ball[i].getX() + ", y=" + this.ball[i].getY() + "\n";
        return s;
        }
}
