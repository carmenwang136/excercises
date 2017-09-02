
public class Test {

	public static void main(String[] args) {
		// Create new timer class
		Timer t = new Timer();
		// Start the timer
		t.start();
		// Test via sleep
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Stop the timer
		t.stop();
		System.out.println(t.getTime());
	}
}
