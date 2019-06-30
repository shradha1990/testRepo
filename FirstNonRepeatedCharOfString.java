import java.util.LinkedHashMap;


public class FirstNonRepeatedCharOfString {
	
	public static char uniqueCharacter(String str){
		LinkedHashMap<Character,Integer> map= new LinkedHashMap<Character,Integer>();
		char[] arr=str.toCharArray();
		if(str==null){
			return 0;
		}
		for(int i=0;i<arr.length;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i]) +1);
			}
			else{
				map.put(arr[i],1);
			}
		}
		for(Character c:map.keySet()){
			if(map.get(c)==1){
				return c;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		String str="shradhas";
		System.out.println("The 1st non repeated character is :" +uniqueCharacter(str));
	}
}
