package Shapes;
import java.util.Scanner;
public class Rectangle {
	private int length;
	private int width;
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	public Rectangle() {
		this.length = 50;
		this.width = 25;
	}

	public int area() {
		return length*width;
	}
	public int perimeter() {
		return 2*(length*width);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Введіть довжину другого прямокутника: ");
		int l=scan.nextInt();
		System.out.println("Введіть ширину другого прямокутника: ");
		int w =scan.nextInt();
		Rectangle obj1 = new Rectangle();
		Rectangle obj2 = new Rectangle(l,w);
		System.out.println("Площа першого прямокутника = "+ obj1.area());
		System.out.println("Периметр першого прямокутника = "+obj1.perimeter());
		System.out.println("Площа другого прямокутника = "+ obj2.area());
		System.out.println("Периметр другого прямокутника = "+obj2.perimeter());
		scan.close();
	}
}

