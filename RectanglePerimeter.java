import java.util.Scanner;
public class RectanglePerimeter {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
		int length = 0;
		int width = 0;
		int area = 0;
		int perimeter = 0;
		
		System.out.print("Enter the length of the Rectangle : ");
		length = scanner.nextInt();
		
		System.out.print("Enter the width of the Rectangle : ");
		width = scanner.nextInt();
		
		area = length * width;
		perimeter = 2 * (length + width);
		
		System.out.println("The Area of the Rectangle is : " + area);
		System.out.println("The Perimeter of the Rectangle is : " + perimeter);
		
		
		

	}

}