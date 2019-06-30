
public class DistinctSubsequenceInSequence {
	
	public static int distinctSeq(String str1, String str2,int m, int n){
		if((m==0 && n==0) ||n==0){
			return 1;
		}
		if(m==0){
			return 0;
		}
		if(str1.charAt(m-1)==str2.charAt(n-1)){
			return distinctSeq(str1,str2,m-1,n-1)+
					distinctSeq(str1,str2,m-1,n);
		}
		else{
			return distinctSeq(str1,str2,m-1,n);
		}
	}
	
	public static void main(String[] args) {
		String str1="shradha";
		String str2="radha";
		System.out.println("the distinct subseqence is :" +distinctSeq(str1,str2,str1.length(),str2.length()));
	}
}
