package CF71A;
import java.util.*;
public class bit_282A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int res =0;
		for(int i=0;i<a;i++) {
			String str = scan.next();
			if(str.contains("+")) {
				res++;
			}
			else {
				res--;
			}
		}
		System.out.println(res);
	}
}
