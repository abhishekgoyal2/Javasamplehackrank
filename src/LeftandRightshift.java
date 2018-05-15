
public class LeftandRightshift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Aftershift=Shift("Ramin",1,2);
		System.out.println("String After left and righ shift --- " + Aftershift);
	}
	
	
	/*
     * Complete the oddNumbers function below.
     */
    public static String Shift(String str, int left,int right) {
        /*
         * Write your code here.
         */
   
    	int size=str.length();
    	System.out.println("size of string is--- " + size );
    	String str2;
      str2=str.substring(left,size)+str.substring(0,left);
      System.out.println("String after left shift--  "+ str2);
      str=str2.substring(size-right,size-1 )+str2.substring(0, right);
    	
       return str;
        
    }


}
