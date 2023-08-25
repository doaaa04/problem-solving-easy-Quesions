import java.util.Scanner;
public class lexicographically{
	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		String one =scan.next().toLowerCase();
		String two =scan.next().toLowerCase();
		int num =0;
		if (one.equals(two)){num=0;}
		   else {
		       	for (int i =0;i<one.length();i++){
		   if (one.charAt(i)>two.charAt(i)){num =1; break;}
		   else if (one.charAt(i)<two.charAt(i)){
		       num =-1; 
		   break;
		       
		   }
		}
		   }
		
	
	
		
		System.out.println(num);
		
	}
