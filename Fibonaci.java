import java.util.Scanner;


public class Fibonaci {
	
	public static int fibo(int n){
		if(n==0){
			return 0;
		}
		if(n==1 || n==2){
			return 1;
		}
		return fibo(n-1)+fibo(n-2);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(true){
			System.out.println("Please enter the input");
			int val=sc.nextInt();
			for(int i=0;i<val;i++){
				System.out.println(fibo(i));
			}
		}
		
		
	}
}
