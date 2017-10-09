package io;

import java.util.*; 
import java.io.*;
/***
 * 
 * @author ABRAM 2017.10.08
 * 使用Print流实现控制台输入字符流到log文件
 */
public class TestPrintStream3 {
  public static void main(String[] args) {
    String s = null;
    //从控制台输入流，1、定义好Buffered用作读取流。2、用FileWrite写入文件流。3、将filewrite流传入Print流实现最后的打印
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      FileWriter fw = new FileWriter("C:\\Users\\ABRAM\\Desktop\\11.txt", true); //Log4J
      PrintWriter log = new PrintWriter(fw);
    /////////////////////////////////////////////////////////////////////////////////////////////////  
      
      while ((s = br.readLine())!=null) {
        if(s.equalsIgnoreCase("exit")) break;
        System.out.println(s.toUpperCase());
        //写入到文件
        log.println("-----");
        log.println(s.toUpperCase()); 
        log.flush();
      }
      log.println("==="+new Date()+"==="); 
      log.flush();
      log.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}