package starting;

public class Task1 extends Thread {
	
	@Override
	public void run(){
		for(int i=1; i<=10; i++) {
			System.out.println("Task 1 " + i);
			
		}
		
		System.out.println("Task 1 Thread is Completed");
	}
}
