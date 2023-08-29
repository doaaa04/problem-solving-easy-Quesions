/******************************************************************************

                            https://codeforces.com/group/yg7WhsFsAp/contest/355490/problem/P09.

*******************************************************************************/
import java.util.Scanner;
public class P09
{
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		int num =scan.nextInt();
		String s =scan.next();
		int number =num;
		int finals=0;
		
		for (int i=0;i<num;i++){
		    if (s.charAt(i) == '8'){
		        
		        if (number-1 >=10){finals++; number-=11;}
		        else {break;}
		    }
		}
		
		
		System.out.println(finals);
	}
}
