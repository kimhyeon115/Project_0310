package Package_1;
class Point {
	int x,y;
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "x=" + x + "," + "y=" + y;
	}
}
class Circle implements Cloneable{			//복제할 수 있도록 하겠다는 의미를 갖는다
	Point point;
	private int radius;
	
	public Circle(int x, int y, int radius) {
		point = new Point(x,y);
		this.radius = radius;;
	}
	public String toString() {
		return "원점은 " + this.point + "이고, 반지름은 " + radius + "입니다";
	}
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
public class ObjectCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle(10,20,5);
		Circle cloneCircle = (Circle)circle.clone();		//add throw declaration 한다
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(cloneCircle));
		System.out.println(circle);							//각각의 String 값이 출력된다
		System.out.println(cloneCircle);					//복제되어서 두 개 모두 같은 것이 출력되는 것을 볼수 있다
	}

}
