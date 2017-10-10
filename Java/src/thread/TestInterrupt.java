package thread;
import java.util.*;
/***
 * 
 * @author ABRAM 2017.10.10
 *sleep方法和interrupt方法
 */
public class TestInterrupt {
	
  public static void main(String[] args) {
    MyThread thread = new MyThread();
    //启动线程
    thread.start();
    try {
    	Thread.sleep(5000);//在2秒时sleep主线程
    	//thread.sleep(5000);这样子也可以以？
    	}
    catch (InterruptedException e) {}
    thread.interrupt();//在sleep时候会抛异常，Interrupts this thread. 
  }
}
//只做实验 所以继承了Thread 一般不建议这么做
class MyThread extends Thread {
	boolean flag = true;
  public void run(){
    while(flag){
     //打印当前时间
      System.out.println("==="+new Date()+"===");
      try {
        sleep(1000);
      } catch (InterruptedException e) {
        return;
      }
    }
  }
}
/*
public void run() {
    while (true) {
      String temp = new Date().toString();
      String t = temp.substring(11, temp.indexOf('C'));
      t = t.trim();
      String[] time = t.split(":");
      if (time.length == 3) {
        System.out.println(“现在是” + time[0] + “点” + 
                  time[1] + "分" + time[2] + "秒");
      }
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        return;
      }  
    }
  }
}
*/