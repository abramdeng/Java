package io;
import java.io.*;
/***
 * 
 * @author ABRAM 2017.10.09
 *FileWrite写出字符到文件
 *
 */
public class TestFileWriter {
  public static void main(String[] args) {
    FileWriter fw = null;
    try {
      fw = new FileWriter("C:\\Users\\ABRAM\\Desktop\\unicode.dat");
      for(int c=0;c<=50000;c++){
        fw.write(c);
      }
      fw.close();
    } catch (IOException e1) {
    	e1.printStackTrace();
      System.out.println("文件写入错误");
      System.exit(-1);
    }
  }
}
