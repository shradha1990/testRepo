import java.util.concurrent.locks.ReentrantLock;

public class OddEvenPrintMain {
	
	public static final String str="lock";
	public static int counter=1;
	public static boolean flag=true;
	
	public static final ReentrantLock lock= new ReentrantLock();
	
	public static void main(String[] args) {
		
		Thread t1= new Thread(new Runnable(){

			@Override
			public void run() {
				while(true){
					lock.lock();
					if(flag){
						System.out.println(Thread.currentThread().getName() + " " +counter);
					}
					flag=false;
					counter++;
					lock.unlock();
				}
				
			}
			
		});
		
		Thread t2= new Thread(new Runnable(){

			@Override
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				while(true){
					lock.lock();
					if(!flag){
						System.out.println(Thread.currentThread().getName() + " " +counter);
					}
					flag=true;
					counter++;
					lock.unlock();
				}
				
			}
			
		});
		
		t1.start();
		t2.start();
	}
}