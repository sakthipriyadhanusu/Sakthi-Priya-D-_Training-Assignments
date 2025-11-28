//package javapkg;

//public class typecast {

//	public static void main(String[] args) {
//		long longNum=876543210087509l;
//		int intNum=(int)longNum;
//		System.out.print(intNum);

//	}

//}
//

package javapkg;
import java.util.Scanner;
public class typecast {
	

	public static void main(String[] args) {
		//float f=9.13f;
		//double d=(double)f;
		//System.out.print(d);
		
		//String s="123";
		//int i=(int)s;
		//int i2=100;
		//char ch='a';
		//int chr=(char)ch;
		//System.out.print(chr);
        Scanner sc = new Scanner(System.in);      
        //int n = sc.nextInt();
        //int[] arr = new int[n];      
        //for (int i = 0; i < n; i++) 
        //{
         //   arr[i] = sc.nextInt();
        //}       
        //for (int i = 0; i < arr.length; i++) 
        //{
        //    System.out.println(arr[i]);
        //}
        int m=sc.nextInt();
        int n=sc.nextInt();
        
        
        int[] [] twodarr=new int[m][n];
       
        
        for(int i=0;i<m;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        		twodarr[i][j]=sc.nextInt();
        		
        	}
        }
        int search=sc.nextInt();
        for(int i=0;i<m;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        		if(twodarr[i][j]==search)
        		{
        			
        			System.out.println("The search element is found");
        			
        		}
        		else
        		{
        			System.out.println("The search element is not found");
        		}
        	}
        }
    

	}

}
