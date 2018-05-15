
public class Printoddnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oddNumbers(1,22);
//		System.out.println();
	}
	
	
	/*
     * Complete the oddNumbers function below.
     */
    static void oddNumbers(int l, int r) {
        /*
         * Write your code here.
         */
    	int i;
    	int oddbet = l;
        int[] arr=new int[5];
      
       
        for (i=0;i<arr.length;i++)
        {
        	 while(oddbet<r)
             {
//        	for(oddbet=l;oddbet<r;oddbet++)
            if((oddbet%2)!=0)
            {
            	arr[i]=oddbet;
            	System.out.println("this is odd number list -- " +arr[i]);
      }

         	 oddbet++;

        	
}

        }
//return arr;
    }


}
