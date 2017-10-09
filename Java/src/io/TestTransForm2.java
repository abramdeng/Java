package io;
import java.io.*;
/***
 * 
 * @author ABRAM 2017.10.09
 * 将System.in转换为Reader对象，并套一个BufferedReader使用readLine()方法
 * 输入到String中，最后转化为大写输出。
 * 关键词：System.in,StreamReader,BufferedReader,readLine().
 */
public class TestTransForm2 {
  public static void main(String args[]) {
    InputStreamReader isr = 
            new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String s = null;
    try {
      s = br.readLine();//使用BufferedReader一行行读
      while(s!=null){
        if(s.equalsIgnoreCase("exit")) break;
        System.out.println(s.toUpperCase());
        s = br.readLine();
      }
      br.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
} //×èÈû