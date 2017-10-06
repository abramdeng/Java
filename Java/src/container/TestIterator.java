package container;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
/***
 * 
 * @author ABRAM 2017.10.06	
 * 使用iterator遍历和删除容器的元素
 *
 */
public class TestIterator {
	public static void main(String args[]) {
		
		Collection c  = new HashSet();
		c.add(new Name("fff1", "l1"));
		c.add(new Name("f2", "l2"));
		c.add(new Name("ffff3", "l3"));
		Iterator i = c.iterator();  //返回一个iterator
		while(i.hasNext()){
			//next的返回值为Object类型，需要转换为相应的类型
			Name n = (Name) i.next();
			System.out.println("容器的元素有"+"["+n.getFirstName()+"，"+n.getLastName()+"]");
		}
		//使用remove删除元素,如果元素长度大于3，则删除
		for(Iterator x = c.iterator();x.hasNext();){
			Name name = (Name) x.next();
			if (name.getFirstName().length()<3) {
				x.remove();
			}
		}
		//输出collection
		System.out.println("删除后的元素有"+c);
	}	
	
	
	
	
}
