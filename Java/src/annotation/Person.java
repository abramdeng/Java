package annotation;
/***
 * 
 * @author ABRAM
 *接口
 */
public interface Person {

	public String name();
	
	public int age();
	
	@Deprecated
	public void sing();

}
