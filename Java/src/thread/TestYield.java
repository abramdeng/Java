package thread;
/***
 * 
 * @author ABRAM 2017.10.10
 * yied方法,线程让出CPU,给其他线程执行机会
 */
public class TestYield {
	public static void main(String[] args) {
		//t1和t2线程
		MyThread3 t1 = new MyThread3("t1");
		MyThread3 t2 = new MyThread3("t2");
		t1.start(); t2.start();
	}
}

class MyThread3 extends Thread {
	MyThread3(String s){super(s);}
	public void run(){
		for(int i =1;i<=100;i++){
			System.out.println(getName()+": "+i);
			if(i%10==0){			
				yield();//相当于切换线程
				System.out.println("我让出CPU");
			}
		}
	}
}

