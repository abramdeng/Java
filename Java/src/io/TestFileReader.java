package io;
import java.io.*;
/***
 * 
 * @author ABRAM 2017.10.09
 * FileReader读取字符集并输出，不会出现乱码
 *
 */
public class TestFileReader {
  public static void main(String[] args) {
    FileReader fr = null; 
    int c = 0;
    try {
      fr = new FileReader("E:\\Java教程\\马士兵JAVA\\java\\io\\TestFileInputStream.java");
      int ln = 0;
      while ((c = fr.read()) != -1) {
        //char ch = (char) fr.read();
        System.out.print((char)c);
        //if (++ln >= 100) { System.out.println(); ln = 0;}
      }
      fr.close();
    } catch (FileNotFoundException e) {
      System.out.println("找不到指定文件");
    } catch (IOException e) {
      System.out.println("文件读取错误");
    }

  }
}