/******************************************************************************

                            going to use multi-sorting algorithms 
                            -bubble sort 
                                procedure bubble sort (a1,...,an : real numbers with n>=2)
                                for i := 1 to n-1
                                 for j:= 1 to n-i
                                 if aj>aj+1 then interchange aj and aj+1
                              {a1,...,an is in increasing order}
                              
                            - insertion sort 
                               procedure insertion sort (a1,a2,...,an : real numbers with n>=2)
                               for j:= 2 to 
                                   i:= 1 
                                   while aj > ai 
                                     i:= i + 1 
                                   m:=aj
                                   for k:= 0 to j - i - 1
                                       aj-k := aj-k-1
                                    ai :=m 
                                {a1,...,an is in increasing order}
*******************************************************************************/
import java.util.Scanner;
public class sorting_algorithms
{
	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		int n =scan.nextInt();
		int a []=new int [n];
		
		for (int i =0;i<n;i++){
		    a[i]=scan.nextInt();
		}
		
		for (int i =0 ;i<n;i++){
		    for (int j =0;j<n-i-1;j++){
		        if (a[j]>a[j+1]){
		            a[j] +=a[j+1];
		            a[j+1]=a[j]-a[j+1];
		            a[j]-=a[j+1];
		        }
		    }
		}
		
		for (int i =0;i<n;i++){
		    System.out.print(a[i]+" ");
		}
	}
}
