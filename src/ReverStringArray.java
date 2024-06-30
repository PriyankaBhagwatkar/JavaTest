
public class ReverStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println(reverseWord("Aditya"));
	}
	
	 public static String reverseWord(String str)
	    {
	        // Reverse the string str
	        char[] charArray = str.toCharArray();
	        int left = 0;
	        int right = charArray.length - 1;
	        
	         while (left < right) {
	            char temp = charArray[left];
	            charArray[left] = charArray[right];
	            charArray[right] = temp;
	            left++;
	            right--;
	        }

	        return new String(charArray);
	    }

}
