package container;


import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ABRAM 2017.10.07
 * 链表的增删改取，常用算法的举例
 */
public class TestList {
	public static void main(String[] args) {
		//链表的增删改取
		List l1 = new LinkedList();
		for(int i =0;i<=5;i++){
			l1.add("a"+i);
		}
		System.out.println("链表元素"+l1);
		l1.add(3,"a100");
		System.out.println("添加后元素"+l1);
		l1.set(6, "a200");
		System.out.println("替换后元素"+l1);
		System.out.println("链表中的第三个元素为"+l1.get(2));
		l1.remove(1);
		System.out.println("去掉位置为1的素后"+l1);
		/////////////////////////////////////////////////
		//list常用算法举例
		List l2 = new LinkedList();
		List l3 = new LinkedList();
		for (int i = 0; i <=9 ; i++) {
			l2.add("a"+i);
		}
		System.out.println("链表元素"+l2);
		Collections.shuffle(l2);//随机洗牌
		System.out.println("随机排列后"+l2);
		Collections.reverse(l2);//逆序
		System.out.println("逆序排列后"+l2);
		Collections.sort(l2);
		System.out.println("排序后"+l2);
		System.out.println("折半查找后a5所在绝对位置："+Collections.binarySearch(l2,"a7"));	
	}

}
