package annotation;
/***
 * 
 * @author ABRAM
 *测试类
 */
public class Test {
	@SuppressWarnings("deprecation")
	
	public void sing(){
		Person p =new Child();
		p.sing();
	}
	public static void main(String args[]) {
		Test t = new Test();
		t.sing();
	}
}
