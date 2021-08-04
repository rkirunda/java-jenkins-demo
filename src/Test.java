import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("PI = "+Math.PI);
		System.out.println("Random Number = "+Math.random());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Enter x:");
			int x = Integer.parseInt(br.readLine());
			System.out.print("Enter y:");
			int y = Integer.parseInt(br.readLine());
			System.out.println("x+y = "+(x+y));
			System.out.println("x*y = "+(x*y));
		} catch (NumberFormatException | IOException ex) {
			System.err.println(ex.getMessage());
		}
	}
}