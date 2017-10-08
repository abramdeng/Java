package container;

import java.util.*;
/***
 * 
 * @author ABRAM 2017.10.08	
 * 使用泛型重写计算单词次数示例
 *
 */
public class TestArgsWords2 {
  private static final int ONE = 1;
  public static void main(String args[]) {
    Map<String, Integer> m = new HashMap<String, Integer>();
    for (int i = 0; i < args.length; i++) {
      //判断计数的算法
      //if不包含相应的key，则放入map中并value=1
      //else使用freq计数，没出现一次同样的key，freq=freq+1;
      if(!m.containsKey(args[i])) {
      	m.put(args[i], ONE);
      }
      else {
      	int freq = m.get(args[i]);
      	m.put(args[i], freq + 1);
      }
      
    }
    System.out.println
        (m.size() + " distinct words detected:");
    System.out.println(m);
  }
}
