public class Circle0 {
	int radius;
	String name; 	


	public Circle0() { }
	
	public double getArea() {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		Circle0 pizza;
		pizza = new Circle0();
		pizza.radius = 10;
		pizza.name = "Java pizza";
		double area = pizza.getArea();
		System.out.println("The area of "+pizza.name+" is "+area);
		
		Circle0 donut = new Circle0();
		donut.radius = 2;
		donut.name = "Java doughnut";
		area = donut.getArea();
		System.out.println("The area of "+donut.name+" is "+area);
	}
}