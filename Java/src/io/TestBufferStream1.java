package io;

import java.io.*;
/***
 * 
 * @author ABRAM 2017.10.09
 * 使用Buffer流读取流，使用mark和reset方法。
 *程序只是输出了内存的转换后的变量（int c）
 */
public class TestBufferStream1 {
  public static void main(String[] args) {
    try {
      FileInputStream fis = 
              new FileInputStream("E:\\Java教程\\马士兵JAVA\\java\\io\\TestFileInputStream.java");
      //将inputStream放入Buffered流中
      BufferedInputStream bis = 
              new BufferedInputStream(fis);
      int c = 0;
      System.out.println((char)bis.read());
      System.out.println((char)bis.read());
      //标记100个字符以后
      bis.mark(100);
      for(int i=0;i<=10 && (c=bis.read())!=-1;i++){
        System.out.print((char)c+" ");
      }
      System.out.println(); 
      //从mark的地方重新开始read
      bis.reset();
      for(int i=0;i<=10&& (c=bis.read())!=-1;i++){
        System.out.print((char)c+" ");
      }
      bis.close();
    } catch (IOException e) {e.printStackTrace();}
  }
}