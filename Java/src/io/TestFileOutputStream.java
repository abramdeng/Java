package io;

import java.io.*;
/***
 * 
 * @author ABRAM 2017.10.09
 * FileInputStream的read方法读取字节流
 *	FileOutputStream中write方法写出字节流到文件对象
 */
public class TestFileOutputStream {
  public static void main(String[] args) {
	  int b = 0;
	  FileInputStream in = null;
	  FileOutputStream out = null;
	  try {
	    in = new FileInputStream("E:\\Java教程\\马士兵JAVA\\java\\io\\TestFileInputStream.java");
	    out = new FileOutputStream("E:\\Java教程\\马士兵JAVA\\java\\io\\HW.java");
	    //read读取字节流，write写出字节流到指定对象
	    while((b=in.read())!=-1){
	      out.write(b);
	      System.out.print((char)b); 
	    }
	    in.close(); 
	    out.close();
	  } catch (FileNotFoundException e2) {
	    System.out.println("找不到指定文件"); System.exit(-1);
	  } catch (IOException e1) {
	    System.out.println("文件复制错误"); System.exit(-1);
	  }
	  System.out.println("文件已复制");
  }
}
