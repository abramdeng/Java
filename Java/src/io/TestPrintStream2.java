package io;

import java.io.*;
/***
 * 
 * @author ABRAM 2017.10.09
 * 使用PrintStream打印文件内容
 *
 */
public class TestPrintStream2 {
  public static void main(String[] args) {
    String filename = args[0];
    //调用list方法
    if(filename!=null){list(filename,System.out);}
  }
  //将文件内容换行输出
  public static void list(String f,PrintStream fs){
    try {
      BufferedReader br = 
                  new BufferedReader(new FileReader(f));
      String s = null; 
      //使用Buffered流读取文件内容
      while((s=br.readLine())!=null){
    	//使用PrintStream打印文件内容
        fs.println(s);            
      }
      br.close();
    } catch (IOException e) {
      fs.println("无法读取文件");
    }
  }
}
