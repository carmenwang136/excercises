
public class Timer {
	// Store the start and stop times of the timer
	private long startTime;
	private long stopTime;
	
	public Timer() {
		
	}
	
	// set the start time to current time in milliseconds
	public void start() {
		startTime = System.currentTimeMillis();
	}
	
	// set the stop time to current time in milliseconds
	public void stop() {
		stopTime = System.currentTimeMillis();
	}
	
	// return elapsed time in milliseconds
	public long getTime() {
		return (stopTime - startTime);
	}
}
