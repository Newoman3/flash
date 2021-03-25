/**
 * 
 */
package forgit;

/**
 * @author HP
 *
 */
class Overload{
	void add(int a, int b) {
		System.out.println("number addition="+(a+b));
	}
	void add(double a, double b) {
		System.out.println("floating point addition="+(a+b));
	}
	String add(String a, String b)
	{
		return (a+" "+b);
	}
	
}
public class MethodOverload {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overload obj = new Overload();
		obj.add(2.3, 3);
		obj.add(2, 3);
		String result=obj.add("hello","world");
		System.out.println(result);
	}

}
