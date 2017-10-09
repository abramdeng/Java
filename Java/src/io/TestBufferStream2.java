package io;

import java.io.*;
/***
 * 
 * @author ABRAM 2017.10.09
 * BufferReader一行行的读取文件
 * BufferWriter写入文件流
 *程序只是写入了内存中的变量（String s）,然后使用write方法写入到文件
 *
 */
public class TestBufferStream2 {
  public static void main(String[] args) {
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\Java教程\\马士兵JAVA\\java\\io\\1111.java"));
      //BufferReader可以一行一行的读取
      BufferedReader br = new BufferedReader(
             new FileReader("E:\\Java教程\\马士兵JAVA\\java\\io\\TestFileInputStream.java"));
      String s = null;
      //Writer写入0到一的随机数
      for(int i=1;i<=100;i++){
        s = String.valueOf(Math.random());
        bw.write(s);
        bw.newLine();
      }
      bw.flush();
      //Reader一行行的读取文件流
      while((s=br.readLine())!=null){
        System.out.println(s);
      }
      bw.close(); 
      br.close();
    } catch (IOException e) { e.printStackTrace();}
  }
}