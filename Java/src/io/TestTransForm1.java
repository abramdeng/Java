package io;
import java.io.*;
/***
 * 
 * @author ABRAM 2017.10.09
 * 使用OutputStreamWriter转换输出流使得可以以字符的方式输出流
 *
 */
public class TestTransForm1 {
  public static void main(String[] args) {
    try {
      //输出一段字符流到文件
      OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\ABRAM\\Desktop\\111.txt"));
      osw.write("mircosoftibmsunapplehp");
      System.out.println(osw.getEncoding());
      osw.close();
      
      //使用另外的构造方法FileOutputStream(File file, boolean append)使字符包含在上次输出流之后而不是覆盖
      osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\ABRAM\\Desktop\\111.txt", true),"ISO8859_1"); // latin-1
      osw.write("mircosoftibmsunapplehp");
      System.out.println(osw.getEncoding());
      osw.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}