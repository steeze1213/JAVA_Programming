class Rectangle {
	int x, y, width, height;
	
	Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	void show() {
		System.out.printf("A square whose size is (%d,%d) at %dx%d%n", x,y,width,height);
	}

	int square() {
		return width * height;
	}
	
	boolean contains(Rectangle a) {
		
		if((this.x<a.x) && (this.y<a.y) && (this.x+this.width)>(a.x+a.width) && (this.y+this.height)>(a.y+a.height))
			return true;
		else
			return false;
	}
	
}
public class Midterm {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2,2,8,7);
		Rectangle s = new Rectangle(5,5,6,6);
		Rectangle t = new Rectangle(1,1,10,10);
		
		r.show();
		
		System.out.println("The area of S is "+s.square());
		if(t.contains(r)) System.out.println("t contains r.");
		if(t.contains(s)) System.out.println("t contains s.");
		
	}
}