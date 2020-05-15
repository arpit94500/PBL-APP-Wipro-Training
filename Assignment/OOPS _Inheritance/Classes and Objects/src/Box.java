
public class Box {

	private int width ,height,depth;
	public Box(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	public int volume() 
	{
		return width*height*depth;
	}

	public static void main(String[] args) {
		
		Box b = new Box(20,30,40);
		int volume = b.volume();
		System.out.println(volume);
	}

}
