/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Remove
{
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		
		int cas =scan.nextInt();
		int counter[]=new int [cas];
		for (int i =0;i<cas;i++){
		    int a =scan.nextInt();
	        int b =scan.nextInt();
		    int c =scan.nextInt();
            int x []=new int [10];
		    int y [] =new int [10];
		    int z[]=new int [10];
		
		for (int j =0;j<a;j++){ 
		    int n =scan.nextInt();
		    x[n]++;
		}
		for (int j =0;j<b;j++){ 
		    int n =scan.nextInt();
		    y[n]++;
		}
		for (int j =0;j<c;j++){ 
		    int n =scan.nextInt();
		    z[n]++;
		}
		
		for (int j=0;j<10;j++ ){
		    int nn=(int)Math.min(x[j],y[j]);   
		    counter[i]+=nn;
		       nn=(int)Math.min(Math.max(x[j],y[j]),z[j]); 
		       counter[i]+=nn;
		}
		}
		
		for (int i =0;i<cas;i++){System.out.println(counter[i]);}
	}
}
