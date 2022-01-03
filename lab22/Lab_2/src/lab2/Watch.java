package lab2;

/**
 * A simple Watch. A Watch keeps track of a long value in seconds.
 *  Users can change the time value of the Watch through other methods.   
 * A Watch provides a method to get and set the time value of the Watch.
 * 
 * 
 *
 */

public class Watch {
	/* To be able to complete this Class, you need to read  the API of this class
	 * 
	 * Hint: Use the WatchTest class to help you test you work  
	 * 
	 * */
	private long startTime;
	
	public Watch() {
		
		this.startTime = 0;
	}
	
	public Watch(long value) {
		
		this.startTime = value;
		
	}
	
	public void decrbyHours(int value) {
		
		this.startTime = this.startTime - value*60*60;
		
		
	}
	
	public void decrbyMinutes(int value) {
		
		this.startTime = this.startTime - value*60;
	}
	
	public long getStartTime() {
		
		return this.startTime;
		
	}
	
	public int getTimeinHours() {
		
		int hour = (int)(this.startTime / 60/60);
		
		return hour;
		
	}
	
	public int getTimeinMinutes() {
		
		int min = (int)(this.startTime / 60);
		
		return min;
	}
	
	public void incrbyHours(int value) {
		
		this.startTime = this.startTime + value *60*60;
	}
	
	public void incrbyMinutes(int value) {
		
		this.startTime = this.startTime + value *60;
	}
	
	public void setStartTime(long startTime) {
		
		this.startTime = startTime;
	}
	
	public String toString() {
		
		int hours = (int)(this.startTime/(60*60));
		int mins = (int)(this.startTime /60-(hours*60));
		int sec =(int)(this.startTime%60);
		return  "Watch Time is " +  hours+ " Hours, " + mins + " Minutes, and " + sec + " Seconds.";
	}
}
