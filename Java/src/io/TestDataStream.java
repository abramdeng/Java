package io;

import java.io.*;
/***
 * 
 * @author ABRAM 2017.10.09
 * 使用data stream 操作流
 */
public class TestDataStream {
  public static void main(String[] args) {
	//字节数组
    ByteArrayOutputStream baos = 
                        new ByteArrayOutputStream();
    //使用data流完成对字节数组的操作
    DataOutputStream dos = 
                        new DataOutputStream(baos);
    try {
       //写入数据
      dos.writeDouble(Math.random());
      dos.writeBoolean(true);
      
      ByteArrayInputStream bais = 
          new ByteArrayInputStream(baos.toByteArray());
      //Returns the number of remaining bytes that can be read (or skipped over) from this input stream. 
      System.out.println(bais.available());
      DataInputStream dis = new DataInputStream(bais);
      //通过data stream 读取流 先写先读（队列）
      System.out.println(dis.readDouble());
      System.out.println(dis.readBoolean());
      dos.close();  dis.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}