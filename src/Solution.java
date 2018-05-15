/*
     * Complete the findNumber function below.
     */

public class Solution{
	static int[] arr;
	
static String res;
    static String findNumber(int[] arr, int k) {
        /*
         * Write your code here.
         */
    	String res;
        boolean numberfind=false;
        for(int i=0;i<arr.length;i++)
        {
            if(k==arr[i])
            {
             
                System.out.println("Number k is present" +k);
            numberfind=true;
                break;
            }
        }
        
            if(numberfind)
            {
            	res="Yes";
                System.out.println("number k is find in array");
            }
            
            else
            {
            	res="No";
                 System.out.println("number k is not find in array");
            }
           
		return res;
        }
    
    public static void main()
    {
    	
		String result=findNumber(arr,4);
		System.out.println(result);
    }
    
}

