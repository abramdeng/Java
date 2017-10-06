package container;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ABRAM 2017.10.06
 *	Set方法举例,retainall方法取交集
 *	set中相同的元素不会被添加
 */
public class TestSet {
	
	public static void main(String[] args) {
		//hashset是set的实现类
		Set s1 = new HashSet();
		Set s2 = new HashSet();
		s1.add("a");
		s1.add("b");
		s1.add("c");
		s2.add("a");
		s2.add("b");
		s2.add("d");
		s2.add("e");
		//将s1容器传入hsahset的构造函数
		Set sn = new HashSet(s1);
		//取set的交集
		sn.retainAll(s2);
		Set su = new HashSet(s2);
		su.addAll(s2);
		System.out.println(sn);
		System.out.println(su);
	}
	


}
