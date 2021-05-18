package java_20210518;

public class SynchronizedDemo implements Runnable {
	int x;
	int y;
	
	@Override
	public void run() { // public synchronized void 가능
		synchronized(this) { // SyncronizedDemo.class 도 가능
			for(int i=0; i<1000; ++i) {
				x++;
				y++;
				
				String threadName = Thread.currentThread().getName();
				System.out.printf("x: %d, y: %d - %s\n", x, y, threadName);
			}
		} // syn
	} // run
	
	public static void main(String[] args) {
		SynchronizedDemo s1 = new SynchronizedDemo();
		SynchronizedDemo s2 = new SynchronizedDemo();
		
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s1);
		
		t1.start();
		t2.start();
	} // main
	
} //class
