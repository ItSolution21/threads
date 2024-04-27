package starting;

public class Task2 extends Thread {
	
	@Override
	public void run() {
		for(int i=100; i>=90; i--) {
			System.out.println("Task 2 " + i);
			
		}
		
		System.out.println(" Task 2 is completed");
	}
}
