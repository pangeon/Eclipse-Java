package topic32.list;

public class Benchmark {
	private long start = 0;
	private long end = 0;
	
	public void setStart() {
		start = System.currentTimeMillis();
	}
	public void setEnd() {
		end = System.currentTimeMillis();
	}
	private long getStart() {
		return start;
	}
	private long getEnd() {
		return end;
	}
	public void printTime() {
		long difference = getEnd() - getStart();
		System.out.println(difference);
	}
	
	
	
}
