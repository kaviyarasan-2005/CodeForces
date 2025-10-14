package CF71A;
import java.util.*;
public class Team231A {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();
			int c=0;
			for(int i=0;i<a;i++) {
				int l = scan.nextInt();
				int k = scan.nextInt();
				int j = scan.nextInt();
				if(l+k+j >= 2) {
					c++;
				}
			}
			System.out.println(c);
		}
}
