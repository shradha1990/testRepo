
public class FirstNonRepeatedWithoutCollection {

	public static void nonRepeated(String str){
		int[] array=new int[256];
		
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
		 array[c]+=1;
		}
		
		int index=Integer.MAX_VALUE; 
		for(int i=0;i<array.length;i++){
			if(array[i]==1){
				char nonRepChar=(char)i;
				
				//System.out.println(nonRepChar);
				if(index>str.indexOf(nonRepChar)) //--significance of this row?
				index=str.indexOf(nonRepChar);
				
				
			}
		}
		System.out.println(str.charAt(index));
		
	}
	public static void main(String[] args) {
		
		   nonRepeated("shrasdha");
	}

}
