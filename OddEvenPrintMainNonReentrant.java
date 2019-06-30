
public class OddEvenPrintMainNonReentrant {

	public static boolean flag=true;
	public static int counter=0;
	
	private static final String str="lock";
	
	
	public static void main(String[] args) {
		
		Thread t1= new Thread(new Runnable(){

			@Override
			
			public void run() {
				while(true){
					
					synchronized (str) {
					if(flag){
					System.out.println(Thread.currentThread().getName() + " " +counter++);
					flag=false;
					}
					try {
						
						str.wait();
						
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					
					str.notify();
				}
				
				}
				
			}
			
		});
		
		Thread t2= new Thread(new Runnable(){

			@Override
			public void run() {

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				while(true){
				synchronized (str) {
					
				
					if(!flag){
					System.out.println(Thread.currentThread().getName() + " " +counter++);
					flag=true;
					}
					
					str.notify();
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					
					try {
						str.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
				
				}
				
			}
			
		});
		
		t1.start();
		t2.start();

	}

}
