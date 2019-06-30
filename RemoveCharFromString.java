import java.util.HashMap;


public class RemoveCharFromString {

	public static String removeChar(String str,int c){
		
		if(str==null){
			return null;
		}
		
		return str.substring(0, c) + str.substring(c + 1);  
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(removeChar("shradha", 3));
	}

}
