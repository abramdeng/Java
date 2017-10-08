package container;
import java.util.*;
/***
 * 
 * @author ABRAM 2017.10.08
 * 使用泛型重写Map示例
 *
 */
public class TestMap2 {
  public static void main(String args[]) {
    Map<String, Integer> m1 = new HashMap<String , Integer>(); 
    m1.put("one", 1);
    m1.put("two", 2);
    m1.put("three", 3);

    System.out.println(m1.size());
    System.out.println(m1.containsKey("one"));

    if(m1.containsKey("two")) {
      //int i = ((Integer)m1.get("two")).intValue();
      int i = m1.get("two");
      System.out.println(i);
    }

  }
}