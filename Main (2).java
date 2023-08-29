/******************************************************************************
 
https://codeforces.com/group/yg7WhsFsAp/contest/355493/problem/P21                          
*******************************************************************************/
import java.util.*;
public class P21
{
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		int num =scan.nextInt();
		boolean[] arr = new boolean[num+1];
		// make all the boolean array is true value
		for (int i = 0; i< arr.length; i++) {
         arr[i] = true;
         }
         //
      for (int i = 2; i<= Math.sqrt(num); i++) {
         if(arr[i] == true) {
            for(int j = (i*i); j<=num; j = j+i) {
               arr[j] = false;
            }
          }
        }
        
      ArrayList<Integer>primes=new ArrayList<>();
      
      for (int i = 2; i< arr.length; i++) {
         if(arr[i]==true) {
             primes.add(i);
             
         }
      }
      System.out.println(primes.size());
	  for (int i =0;i<primes.size();i++){System.out.print(primes.get(i)+" ");}
		
	}
}