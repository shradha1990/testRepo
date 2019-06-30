import java.util.Scanner;


public class MissingNum {

	public static int missingNum(int[] intArray,int n){
		int lastelem=intArray[intArray.length-1];
		int realSum=0,elemSum=0;
		realSum=(n+1)*(n+2)/2;
		for(int i=0;i<intArray.length;i++){  //1 2 3 5
			 elemSum=elemSum+intArray[i];
		}
		return realSum-elemSum;
	}
	public static void main(String[] args) {
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
		int[] intArray={1,2,3,5,4,8,7};
		System.out.println("the missing elem is :" +missingNum(intArray,7));
	}

}
