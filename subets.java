/******************************************************************************

                            	B subsets

*******************************************************************************/
import  java.util.*;
public class subets
{
	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		int cas =scan.nextInt();
		int a []=new int[cas];
		int b []=new int [cas];
		int counter=0;
		
		//read
		for (int i =0;i<cas;i++){
		    a[i]=scan.nextInt();
		    b[i]=scan.nextInt();
		}
		//Process
		
		 for (int i =0;i<cas;i++){
		     if (a[i]>=b[i]){
		         counter++;
		         System.out.println(" the counter "+counter + "the a[i] "+a[i]);
		         int num =b[i];
		         
		         for (int j=0;j<cas ;j++){
		             if (j==i){continue;}
		             for (int m =j ;m<cas;m++){
		                 if ((m!=i)){
		                     num+=b[m];
		                     if (num<=a[i]){
		                         counter++;
		                         System.out.println("counter= "+ counter +" the j = "+ j+" the b[m] "+b[m]+ " the sum="+num +" the a[i] = "+a[i]);
		                     }
		                 }
		                
		             }
		             num=b[i];
		         }
		         
		     }
		 }
		
		//output
		System.out.println(counter);
	}
}
