package annotation;
/***
 * 
 * @author ABRAM
 */
@Description("I am class ann")
public class Child implements Person {

	@Override
	@Description("I am method ann")
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int age() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("sing!");
	}

}
