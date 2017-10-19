public class TestBalls {
	public static void main(String[] args) {
	    Balls b = new Balls(5);
        System.out.println(b.toString());
        b.translate(5,5);        
        System.out.println(b.toString());
        b.reInit(); 
        System.out.println(b.toString());
    }
}
