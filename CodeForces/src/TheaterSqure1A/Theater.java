package TheaterSqure1A;
import java.util.*;
public class Theater {
	public static void main(String[] str) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextInt();
		long b = scan.nextInt();
		long c = scan.nextInt();
		if(c ==0) {
			System.out.println(0);
			return;
		}
		long length = a/c;
		long breadth = b/c;
		if(a % c >0) {
			length++;
		}
		if(b%c >0) {
			breadth++;
		}
		System.out.println(length*breadth);
	}
}
