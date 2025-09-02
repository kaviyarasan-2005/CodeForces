package CF71A;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
	
		for(int i=0;i<a;i++) {
			String str = scan.next();
			scan.nextLine();
			int l=str.length();
			
			if(l<=10) {
				System.out.println(str);
			}
			else{ 
				System.out.println(str.charAt(0)+""+ (l- 2)+""+str.charAt(l-1));
			}
		}
	}
}
