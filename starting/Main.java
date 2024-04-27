package starting;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Hello world");
//		Thread.currentThread().setName("Rahul");	
//		System.out.println(Thread.currentThread().getName());
		
		//thread priority flow between 1 to 10 
//			in which 10 priority means thread are gonna have strong priority
//		low priority (1) -- demon thread garbage collection 
		
//		JVM automatically destroy threads after execution of all the threads
		
//		milli - 10^-3 
//		1000 mili second = 1000 * 10^-3 second  => 1000/1000 seconds => 1s 
		
//		Thread.sleep(3000);
//		
//		for(int i=5; i>=0; i--) {
//			System.out.println(i);
//			Thread.sleep(1000);
//		}
		
//		Thread.currentThread().setPriority(1);
//		System.out.println(Thread.currentThread().getPriority());
		System.out.println("Hurray !!!!");
	}
}
