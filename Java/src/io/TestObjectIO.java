package io;

import java.io.*;

/***
 * 
 * @author ABRAM 2017.10.08
 * 使用ObjectStream读写文件并写入到序列化类中然后进行操作
 * transient值在序列化的时候无用
 * Serializable标志可以序列化
 * Externalizable自己控制序列化
 */
public class TestObjectIO {
	public static void main(String args[]) throws Exception {
		T t = new T();
		t.k = 8;
		//输出流
		FileOutputStream fos = new FileOutputStream("C:\\Users\\ABRAM\\Desktop\\1.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//写入流到对象t
		oos.writeObject(t);
		oos.flush();
		oos.close();
		//输入流
		FileInputStream fis = new FileInputStream("C:\\Users\\ABRAM\\Desktop\\1.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		//文件读出来为Object,强转为T
		T tReaded = (T)ois.readObject();
		System.out.println(tReaded.i + " " + tReaded.j + " " + tReaded.d + " " + tReaded.k);
		
	}
}

//将类实现序列化
class T 
	implements Serializable
{
	int i = 10;
	int j = 9;
	double d = 2.3;
	transient int k = 15;
}