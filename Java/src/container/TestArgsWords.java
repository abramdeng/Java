package container;

import java.util.*;
/***
 * 
 * @author ABRAM 2017.10.08
 * 注释的为加包的麻烦写法
 * 不注释的为正常jdk解包写法
 */
public class TestArgsWords {
	  //private static final Integer ONE = new Integer(1);
	  private static final int ONE = 1;
	  public static void main(String args[]) {
	    Map m = new HashMap();
	    //
	    for (int i = 0; i < args.length; i++) {
	    	
	    	//拿m的key的value,如果value为空，则赋值freq为0。如果不为空则freq赋值为m的value
	    	int freq = (Integer) m.get(args[i]) == null ? 0 : (Integer) m.get(args[i]);
	    	//Integer freq = (Integer) m.get(args[i]);
	    	
	    	
	    	//args[i]为输入的key,freq为0时赋值为1否则赋值freq+1(实现了计数的操作)
	    	//例如aaa出现两次 第一次value=1 第二次freq不等于0，则value+1实现了单词的计数
	        m.put(args[i],freq == 0? ONE:freq +1);
	        //m.put(args[i],(freq == null? ONE : new Integer(freq.intValue() + 1)));
	        
	        
	    }
	    System.out.println
	        (m.size() + " distinct words detected:");//
	    System.out.println(m);
	  }
	}
