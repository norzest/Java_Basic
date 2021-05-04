package java_20210503;
import java.util.Scanner;

public class ForStar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		ForStar forstar = new ForStar();
		forstar.diamond(n);
		System.out.printf("====================\n\n");
		forstar.star(n);
		
	} // main

	public void diamond(int n) {
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n-i; ++j) {
				System.out.print(" ");
			} // for j
			
			for (int j = 0; j < i*2+1; ++j) {			
				System.out.print("*");
			} // for j
			System.out.println();
		} // for i
		
		for (int i = 1; i < n ; ++i) {
			for (int j = 0; j < i+1; ++j) {
				System.out.print(" ");
			} // for j
			for (int j = n*2 - i*2 - 1; j > 0 ; --j) {
				System.out.print("*");
			} // for j
			System.out.println();
		} // for i
		
		
	} // diamond
	
	public void star(int n) {
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n+n-1-i; ++j) {
				System.out.print(" ");
			} // for j
			
			for (int j = 0; j < i*2+1; ++j) {			
				System.out.print("*");
			} // for j
			System.out.println();
		} // for i
		
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < i; ++j) {
				System.out.print(" ");
			} // for j
			for (int j = (n-1)*2 + n*2 + 1 - i*2; j > 0; --j) {
				System.out.print("*");
			} // for j
			System.out.println();
		} // for i
		
		for (int i = 1; i < n; ++i) {
			for (int j = 0; j < n-i-1; ++j) {
				System.out.print(" ");
			} // for j
			for (int j = 0; j < n*2 + 1 + i*2; ++j) {
				System.out.print("*");
			} // for j
			System.out.println();
		} // for i
		
		for (int i = 0; i < n ; ++i) {
			for (int j = 0; j < n+i; ++j) {
				System.out.print(" ");
			} // for j
			for (int j = n*2 - i*2 - 1; j > 0 ; --j) {
				System.out.print("*");
			} // for j
			System.out.println();
		} // for i
	}

} // class