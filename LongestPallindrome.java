
public class LongestPallindrome {

	 //System.out.println(longestPalindromeString("9912333321456"));
	
	
	
	public static String longestPalindromeString(String s){
		
		if(s==null){
			return null;
		}
		
		String longest=s.substring(0, 1);
		for(int i=0;i<s.length()-1;i++){
			
			//odd cases
			String pallindrome=intermidiatePallindrome(s,i,i);
			if(pallindrome.length()>longest.length()){
				longest=pallindrome;
			}
			
			//even cases
			pallindrome=intermidiatePallindrome(s,i,i+1);
			if(pallindrome.length()>longest.length()){
				longest=pallindrome;
			}
			
		}
		return longest;
		
	}
	
	static public String intermidiatePallindrome(String s,int left,int right){
		while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
			left--;
			right++;
		}
		return s.substring(left+1, right);
		
	}
   
	public static void main(String[] args) {
		System.out.println(longestPalindromeString("ababaccddeffaaaaaaaa"));

	}

}
