/******************************************************************************

                            https://codeforces.com/group/yg7WhsFsAp/contest/355493/problem/P13
                            
                            
                            

*******************************************************************************/
import java.util.*;
public class P13
{
       
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		
		long num =scan.nextLong ();
		ArrayList <Long> arr =new ArrayList<>();
		
		for (long i =(long)1;i<=(long)Math.sqrt(num);i++){
		    
		        
		        if (num%i==0){arr.add(num/i+i);}
		   
		}
		Collections.sort(arr);
		System.out.println(2*arr.get(0));
		
	}
}
