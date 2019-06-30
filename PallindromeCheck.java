
public class PallindromeCheck {
//bob
	//boob
	public boolean pallindromeCheck(String str){
		/*StringBuilder sb1=new StringBuilder(str);
		String reverseStr=sb1.reverse().toString();
		if(str.equalsIgnoreCase(reverseStr)){
			return true;
		}
		else
			return false;*/
		
		 
		 
		for(int i=0;i<str.length()/2;i++){
			 
			if(str.charAt(i)!=str.charAt(str.length()-i-1)){
				return false;
			 
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		PallindromeCheck pc= new PallindromeCheck();
		System.out.println("Inside main");
		System.out.println(pc.pallindromeCheck("sdfsfsdaboobaAd"));

	}

}
