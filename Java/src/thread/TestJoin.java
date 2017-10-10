package thread;

/***
 * 
 * @author ABRAM 2017.10.10
 * Join方法:合并线程
 *
 */
public class TestJoin {
	public static void main(String[] args) {
		MyThread2 t1 = new MyThread2("abcde");
		t1.start();
		try {
			t1.join();//Waits for this thread to die
		} catch (InterruptedException e) {}

		for(int i=1;i<=10;i++){
			System.out.println("i am main thread");
		}
	}
}
class MyThread2 extends Thread {
	MyThread2(String s){
		super(s);
	}

	public void run(){
		for(int i =1;i<=10;i++){
			System.out.println("i am "+getName());
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}