

public class Monsters extends Sprite{
	
	public static final int WALK = 0;
	
	
	private static final String[] actions = {"walks"};
	
	private static final int[] counts = {12};
	
	public Monsters(int x, int y){
		super(x, y, 86, 100, "monsters", 5, actions, counts);
		
	}
	
	public void walk_left(int dx) {
		x -= dx;
		moving = true;
	}
	

}
