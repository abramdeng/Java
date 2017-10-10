package thread;
/***
 * 
 * @author ABRAM 2017.10.10
 *使用Runnable接口和Thread类，重写Runnable的Run方法
 */
public class TestThread1 {
	public static void main(String args[]) {
		Runner1 r = new Runner1();
		
		r.run();
		Thread t = new Thread(r);
		t.start();//启动 
		
		for(int i=0; i<100; i++) {
			System.out.println("Main Thread:------" + i);
		}
	}
}

class Runner1 implements Runnable {
//class Runner1 extends Thread {   API：In most cases, the Runnable interface should be used if you are only planning to override the run() method and no other Thread methods.
	public void run() {
		for(int i=0; i<100; i++) {	
			System.out.println("Runner1 :" + i);
		}
	}
}
