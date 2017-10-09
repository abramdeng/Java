package io;

import java.io.*;
/***
 * 
 * @author ABRAM 2017.10.09
 * Print流输出字符到文件
 */
public class TestPrintStream1 { 
  public static void main(String[] args) {
    PrintStream ps = null;
    try {
      FileOutputStream fos = 
              new FileOutputStream("C:\\Users\\ABRAM\\Desktop\\111.txt");
      ps = new PrintStream(fos);
    } catch (IOException e) {
      e.printStackTrace();
    }
    if(ps != null){
      //out输出流到ps
      System.setOut(ps);
    }
    int ln = 0;
    //然后通过ps输出到fos对象指定的文件
    for(char c = 0; c <= 60000; c++){
      System.out.print(c+ " ");
      //每打印100个数换一行
      if(ln++ >=100){ System.out.println(); ln = 0;}
    }
  }
}
 