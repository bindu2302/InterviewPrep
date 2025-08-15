package mypractice;

import java.util.Scanner;

class Rectangle {
	int length;
	int width;
	
	Rectangle(int l,int w) {
		length = l;
		width = w;
	}
	
	int area() {
		return length * width;
	}
	
	int perimeter() {
		return 2 * (length + width);
	}
}
public class Rectangle_Methods {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int width = sc.nextInt();
		
		Rectangle rect = new Rectangle(length,width);
		System.out.println("Area of Rectangle is: " + rect.area());
		System.out.println("Perimeter of Rectangle is: " + rect.perimeter());
	}
}

//5
//3
//Area of Rectangle is: 15
//Perimeter of Rectangle is: 16
