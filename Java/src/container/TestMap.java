package container;
import java.util.*;
/***
 * 
 * @author ABRAM 2017.10.07
 *	map的应用举例，使用put方法放入键值对，containsValue判断是否包含值，containsKey判断是否包含键，
 *  对于treemap和hashmap的区别没有继续研究
 *  Auto—boxing(自动打包):放入值得时候jdk自动将数值打包为对象才放入Map中
 *  unboxing(解包):将对象转化为其他类型
 */
public class TestMap {
  public static void main(String args[]) {
    Map m1 = new HashMap(); 
    Map m2 = new TreeMap();
    //m1.put("one",new Integer(1));
    m1.put("one", 1);  //Auto-boxing
    //m1.put("two",new Integer(2));
    m1.put("three", 3);
    //m1.put("three",new Integer(3));
    m1.put("two", 2);
    //m2.put("A",new Integer(1));
    m2.put("B", 2);
    //m2.put("B",new Integer(2));
    m2.put("A", 1);//TreeMap会排序，hashMap没有为元素排序
    System.out.println(m1);
    System.out.println(m2);
    System.out.println("m1的长度"+m1.size());
    System.out.println("m1中是否包含one的键："+m1.containsKey("one"));
    System.out.println
        //(m2.containsValue(new Integer(1)));
        ("m2中是否包含值为1的："+m2.containsValue(1));
    if(m1.containsKey("two")) {
      //int i = ((Integer)m1.get("two")).intValue();
    //使用get取数，强转
      int i = (Integer)m1.get("two"); //unboxing
      System.out.println("i的值为："+i);
    }
    //将m1,m2放入m3的map中
    Map m3 = new HashMap(m1);
    m3.putAll(m2);
    System.out.println(m3);
  }
}