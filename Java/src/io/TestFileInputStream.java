package io;

import java.io.*;
/***
 * 
 * @author ABRAM 2017.10.09
 *	FileInputStream的read方法读取字节流，转化为Char输出
 */
public class TestFileInputStream {
  public static void main(String[] args) {
    int b = 0;
    FileInputStream in = null;
    try {
      in = new FileInputStream("E:\\Java教程\\马士兵JAVA\\java\\io\\TestFileInputStream.java");
    } catch (FileNotFoundException e) {
      System.out.println("找不到指定文件"); 
      System.exit(-1);
    }
    
    try {
      long num = 0;
      //调用read方法读取文档，返回相应的ASCII码值，到结尾时返回-1
      while((b=in.read())!=-1){
    	//转换b为字符并输出
        System.out.print((char)b); 
        num++;
      }
      //关闭流
      in.close();  
      System.out.println();
      System.out.println("共读取了 "+num+" 个字节");
    } catch (IOException e1) {
      System.out.println("文件读取错误"); System.exit(-1);
    }
  }
}