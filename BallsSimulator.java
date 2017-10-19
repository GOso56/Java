public class BallsSimulator {
    Balls balls;
    
    public BallsSimulator(int size) {
        balls = new Balls(size);
    }

    public void next() {
        balls.translate(10,10); 
    }

    public void restart() {
        balls.reInit(); 
    }
}
