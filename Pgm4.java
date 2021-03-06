package day3;

import java.util.Scanner;

public class Pgm4 {
	static boolean checknumber(int n)
	{
	    boolean flag = true;
	     
	    // to store the previous digit
	    int prev = -1;
	     
	    // pointer to tell what type of sequence
	    // are we dealing with
	    int type = -1;
	 
	    while(n != 0)
	    {
	        if(type ==-1)
	        {
	            if(prev ==-1)
	            {
	                prev = n % 10;
	                n = n/10;
	                continue;
	            }
	            // check if we have same digit
	            // as the previous digit
	            if(prev == n % 10)
	            {
	                flag = false;
	                break;
	            }
	            // checking the peak point of the number
	            if(prev > n % 10)
	            {
	                type = 1;
	                prev = n % 10;
	                n = n/10;
	                continue;
	            }
	             
	            prev = n % 10;
	            n = n / 10;
	        }
	        else
	        {
	            // check if we have same digit
	            // as the previous digit
	            if(prev == n % 10)
	            {
	                flag = false;
	                break;
	            }
	            // check if the digit is greater than
	            // the previous one
	            // If true, then break from the loop as
	            // we are in descending order part
	            if(prev < n % 10)
	            {        
	                flag = false;
	                break;
	            }
	             
	            prev = n % 10;
	            n = n / 10;
	            
	        }
	    }
	 
	    return flag;
	}
	 
	// Driver code
	 
	    public static void main (String[] args) {
	        int n;
	    	System.out.print("enter a number ");
		    Scanner in = new Scanner(System.in);
				    n = in.nextInt();
	     
	    if(checknumber(n))
	        System.out.println("YES");
	    else
	        System.out.println("NO");
	    }
	}


