import java.util.Scanner;


public class ah {

	    public void main(String[] args) 

	    {

	        int n, min = 0, mins = 1, sum, m;

	        Scanner s = new Scanner(System.in);

	        System.out.print("Enter the number of elements:");

	        n = s.nextInt();

	        int a[] = new int[n];

	        System.out.println("Enter all the numbers:");

	        for(int i = 0; i < n; i++)

	        {

	            a[i] = s.nextInt();

	        }

	        m=Math.abs(a[0] + a[1]);

	        for(int i = 0; i < n; i++)

	        {

	            for(int j = i + 1; j < n; j++)

	            {

	                sum = Math.abs(a[i] + a[j]);

	                if(sum < m)

	                {

	                    min = i;

	                    mins = j;

	                    m = sum;

	                }

	            }

	        }

	        System.out.println("Element 1:"+a[min]); 

	        System.out.println("Element 2:"+a[mins]);

	    }

	}

