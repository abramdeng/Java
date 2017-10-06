package container;

import java.util.*;
/***
 * 
 * @author ABRAM 2017.10.06
 * 使用foreach遍历元素
 *
 */
public class EnhancedFor {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		//把arr的元素拉出来放入i中
		for(int i : arr) {
			System.out.println(i);
		}
		
		Collection c = new ArrayList();
		c.add(new String("aaa"));
		c.add(new String("bbb"));
		c.add(new String("ccc"));
		//将c的元素放入o这个对象中
		for(Object o : c) {
			System.out.println(o);//相当于o.toString()
		}
	}
}