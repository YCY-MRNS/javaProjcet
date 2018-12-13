package pers.ycy.report.test2.title3;

public class Shapes {
	public static Shape randShape() {
		switch ((int) (Math.random() * 3)) {
		default: // To quiet the compiler
		case 0:
			return new Circle();
		case 1:
			return new Square();
		case 2:
			return new Triangle();
		}
	}

	public static void main(String[] args) {
		
		 Shape[] s = new Shape[9];
		    // Fill up the array with shapes:
		    for(int i = 0; i < s.length; i++)
		      s[i] = randShape();
		    // Make polymorphic method calls:
		    for(int i = 0; i < s.length; i++)
		      s[i].draw();

	}
}