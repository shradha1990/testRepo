import java.util.Scanner;


public class Test {
	static Scanner sc1= new Scanner(System.in);
	static int B=sc1.nextInt();
	static int H=sc1.nextInt();
	static boolean flag=true;

	  static {
	            try{
	                if(B<=0 || H<=0){
	                    flag= false;
	                    throw new Exception("Breadth and height must be positive");
	                }
	            }catch(Exception e){
	             //  System.out.println(e);
	            	e.printStackTrace();
	            }
	        }

	public static void main(String[] args) {
		if(flag){
			int area=B*H;
			System.out.println(area);
		}

	}

}
