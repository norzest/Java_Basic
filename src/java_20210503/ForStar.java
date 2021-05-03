package java_20210503;
import java.util.Scanner;

public class ForStar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		ForStar forstar = new ForStar();
		forstar.diamond(n);
		System.out.println("====================");
		forstar.star(n);
		
	} // main

	public void diamond(int n) {
		int num = 1 + (n-1)*2;
		for (int i = 0; i < num; ++i) {
			for (int j = n; j > Math.abs(num/2 - i); --j) {				
				System.out.print("*");
			} // for j
			System.out.println();
		} // for i
	} // diamond
	
	public void star(int n) {
		
	}

} // class

/* 15351
  *
*****
 ***
*****
  *
 1375731
    *
   ***
*********
 *******
*********
   ***
    *
13597579531
*/