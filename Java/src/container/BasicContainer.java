package container;

import java.util.*;

/***
 * 
 * @author ABRAM 2017.10.06
 * collection类的玩具类，实现在collection的添加，删除，重写比较方法。
 */
public class BasicContainer {
    public static void main(String[] args) {
        Collection c = new HashSet();
        c.add("hello");
        c.add("123");
        c.add(new Name("f1","l1"));
        c.add(new Integer(100));
        c.remove("hello"); 
        c.remove(new Integer(100));
        System.out.println
                  (c.remove(new Name("f1","l1")));
        System.out.println(c);
    }
}

class Name /*implements Comparable*/ {
    private String firstName,lastName;
    public Name(String firstName, String lastName) {
        this.firstName = firstName; this.lastName = lastName;
    }
    public String getFirstName() {  return firstName;   }
    public String getLastName() {   return lastName;   }
    public String toString() {  return firstName + " " + lastName;  }
    
   /*public boolean equals(Object obj) {
	   //如果obj是一个Name对象
	    if (obj instanceof Name) {
	        Name name = (Name) obj;
	        return (firstName.equals(name.firstName))
	            && (lastName.equals(name.lastName));
	    }
	    return super.equals(obj);
		}
   		//重写hashCode方法
		public int hashCode() {
			System.out.println("firstname:"+firstName.hashCode());
			System.out.println("lastname"+lastName.hashCode());
		    return firstName.hashCode();
		}*/
	  
		/*
		public int compareTo(Object o) {
        Name n = (Name)o;
        int lastCmp = 
            lastName.compareTo(n.lastName);
        return 
             (lastCmp!=0 ? lastCmp :
              firstName.compareTo(n.firstName));
    }*/
		
}

