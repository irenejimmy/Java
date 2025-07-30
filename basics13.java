package irene;

class Shapes{
	public int area(int side) {
		System.out.println("I am Square");
		return side*side;
	}
	public int area(int l, int b) {
		System.out.println("I am rectangle");
		return l*b;
	}
	public float area(float radius) {
		System.out.println("I am circle");
		return 3.14f*radius*radius; 
	}
}
	public class basics13{
		public static void main(String[]args) {
			Shapes Shape=new Shapes();
			int rectangleArea = Shape.area(4,5);
			System.out.println("Area of rectangle;"+rectangleArea);
			int squareArea = Shape.area(4);
			System.out.println("Area of square;"+squareArea);
			float circleArea = Shape.area(4.5f);
			System.out.println("Area of circle;"+circleArea);
		}
	}


