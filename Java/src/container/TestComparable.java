package container;

import java.util.*;
/***
 * 
 * @author ABRAM 2017.10.07
 *	重写compareto方法比较字符串大小并排序，重写的comparato方法在Name类中
 *
 */
public class TestComparable {

	public static void main(String[] args) {
		List l1 = new LinkedList();
		l1.add(new Name("cbram","C"));
		l1.add(new Name("bbram","B"));
		l1.add(new Name("abram","A"));
		
		System.out.println(l1);
		//使用sort方法进行排序，为什么会调用name重写的comparato方法？
		Collections.sort(l1);
		System.out.println(l1);
	}

}
