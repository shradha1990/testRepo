import java.util.LinkedHashMap;


public class MaxCharacter {
	//public static char maxCharValue;
	public static char maxCharacter(String str){

        int len = str.length();
        int count = 0;
 
        // Find the maximum repeating character
        // starting from str[i]
        char res = str.charAt(0);
        for (int i=0; i<len; i++)
        {
            int cur_count = 1;
            for (int j=i+1; j<len; j++)
            {
                if (str.charAt(i) != str.charAt(j))
                    break;
                cur_count++;
            }
 
            // Update result if required
            if (cur_count > count)
            {
                count = cur_count;
                res = str.charAt(i);
            }
        }
        return res;
        /*
		LinkedHashMap<Character, Integer> map= new LinkedHashMap<Character, Integer>();
		char[] chars= str.toCharArray();
		
		int highest=0;
		
		for(int i=0;i<chars.length;i++){
			char c= chars[i];
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}else{
				map.put(c, 1);
			}
			
		}
		
		for(Character c:map.keySet()){
			if(map.get(c)>highest){
				highest=map.get(c);
				
				maxCharValue=c;
			}
		}
		
		
		
		return maxCharValue;
	*/}
	
	public static void main(String[] args) {
	System.out.println("the char which is repeated max times is : "+maxCharacter("Shradhahdass"));

	}

}
