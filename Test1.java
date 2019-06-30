
public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t1= new Thread("t1");
		Thread t2= new Thread("t2");
		
		try{
			t1.join();
			t2.join();
		}catch(Exception e){
			
		}
		System.out.println("");
	}

}
