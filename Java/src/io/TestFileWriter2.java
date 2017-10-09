package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
/***
 * 
 * @author ABRAM 2017.10.09
 * 使用FileReader和FileWriter实现文件拷贝
 *
 */
public class TestFileWriter2 {
		public static void main(String args[]) {
			try {
				FileReader fr = new FileReader("E:\\Java教程\\马士兵JAVA\\java\\io\\TestFileInputStream.java");
				FileWriter fw = new FileWriter("E:\\Java教程\\马士兵JAVA\\java\\io\\111.java");
				int b;
				while((b=fr.read())!=-1){
					fw.write(b);
				}
				fr.close();
				fw.close();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("找不到文件");
			}
			System.out.println("文件以复制");
		}
}
